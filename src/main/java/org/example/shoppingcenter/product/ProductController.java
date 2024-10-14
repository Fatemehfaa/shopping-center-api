package org.example.shoppingcenter.product;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/products")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ProductController {

    ProductService productService;

    @PostMapping("/create")
    public ResponseEntity<ProductDto> create(@RequestBody ProductDto productDto) {
        return ResponseEntity.ok(productService.create(productDto));
    }

    @GetMapping("/loadById/{id}")
    public ResponseEntity<ProductDto> loadById(@PathVariable Long id) {
        return ResponseEntity.ok(productService.findById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<ProductDto> update(@RequestBody ProductDto productDto) {
        return ResponseEntity.ok(productService.update(productDto));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ProductDto> delete(@PathVariable Long id) {
        productService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/loadAll")
    public List<ProductDto> loadAll() {
        return productService.findAll();
    }


}

