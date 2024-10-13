package org.example.shoppingcenter.category;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE , makeFinal = true)
@RequiredArgsConstructor
public class CategoryService {

    CategoryRepository categoryRepository;

    public void createCategory(CategoryEntity category) {
        categoryRepository.save(category);
    }
}
