package org.example.shoppingcenter.category;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@Slf4j
public class CategoryService {

    CategoryRepository categoryRepository;

    public CategoryDto create(CategoryDto category) {
        CategoryEntity entity = CategoryMapper.INSTANCE.toEntity(category);
        return CategoryMapper.INSTANCE.toDto(categoryRepository.save(entity));
    }

    public CategoryDto findById(Long id) {
        log.debug("Request to get Category : {}", id);
        return CategoryMapper.INSTANCE.toDto(categoryRepository.findById(id).orElse(null));
    }

    public CategoryDto update(CategoryDto categoryDto) {
        CategoryEntity category = categoryRepository.findById(categoryDto.getId()).orElseThrow();
        CategoryMapper.INSTANCE.updateToDto(category, categoryDto);
        return CategoryMapper.INSTANCE.toDto(categoryRepository.save(category));
    }

    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }

    public List<CategoryDto> findAll() {
        return CategoryMapper.INSTANCE.listToDto(categoryRepository.findAll());
    }

    public List<CategoryDto> getSubCategories(Long parentId) {
        CategoryDto parent = findById(parentId);
        return parent.getSubCategories();
    }


}
