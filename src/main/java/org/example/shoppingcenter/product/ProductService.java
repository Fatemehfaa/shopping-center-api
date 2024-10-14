package org.example.shoppingcenter.product;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ProductService {

    ProductRepository productRepository;

    public ProductDto create(ProductDto product) {
        ProductEntity entity = ProductMapper.INSTANCE.toEntity(product);
        return ProductMapper.INSTANCE.toDto(productRepository.save(entity));
    }

    public ProductDto findById(Long id) {
        return ProductMapper.INSTANCE.toDto(productRepository.findById(id).orElse(null));
    }

    public ProductDto update(ProductDto productDto) {
        ProductEntity product = productRepository.findById(productDto.getId()).orElseThrow();
        ProductMapper.INSTANCE.updateToDto(product, productDto);
        return ProductMapper.INSTANCE.toDto(productRepository.save(product));
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    public List<ProductDto> findAll() {
        return ProductMapper.INSTANCE.listToDto(productRepository.findAll());
    }
}
