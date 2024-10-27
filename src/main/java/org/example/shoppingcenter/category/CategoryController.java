package org.example.shoppingcenter.category;

import jdk.jfr.Category;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class CategoryController {

    CategoryService categoryService;

    @PostMapping("/create")
    public ResponseEntity<CategoryDto> create(@RequestBody CategoryDto categoryDto) {
        return ResponseEntity.ok(categoryService.create(categoryDto));
    }

    @GetMapping("/loadById/{id}")
    public ResponseEntity<CategoryDto> loadById(@PathVariable Long id) {
        CategoryDto categoryDto = categoryService.findById(id);
        if (categoryDto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(categoryDto);
    }

    @PutMapping("/update")
    public ResponseEntity<CategoryDto> update(@RequestBody CategoryDto categoryDto) {
        return ResponseEntity.ok(categoryService.update(categoryDto));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<CategoryDto> delete(@PathVariable Long id) {
        categoryService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/loadAll")
    public List<CategoryDto> loadAll() {
        return categoryService.findAll();
    }

    @GetMapping("/loadSubCategoryByParent")
    public List<CategoryDto> loadSubCategoryByParent(@RequestBody CategoryDto category) {
        return categoryService.getSubCategories(category.getId());

    }

//    @GetMapping("/loadSubCategoryByParent/{parentId}")
//    public ResponseEntity<List<CategoryDto>> loadSubCategoryByParent(@PathVariable Long parentId) {
//        List<CategoryDto> subCategories = categoryService.getSubCategories(parentId);
//        return ResponseEntity.ok(subCategories);
//    }


}
