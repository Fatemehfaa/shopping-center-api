package org.example.shoppingcenter.config;

import org.example.shoppingcenter.category.CategoryEntity;
import org.example.shoppingcenter.category.CategoryRepository;
import org.example.shoppingcenter.product.ProductEntity;
import org.example.shoppingcenter.shop.ShopEntity;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Initializer {

    @Bean
    CommandLineRunner categoryRunner(CategoryRepository categoryRepository) {
        return args -> {
//            ShopEntity shop = new ShopEntity();
//            shop.setName("nike");
//            shop.setCategory(new CategoryEntity());
//
//            CategoryEntity category = new CategoryEntity(
//                    "kids",
//
//
//
//            ProductEntity.builder()
//                    .title("toy")
//                    .price(9.25)
//                    .description("for playing kids")
//                    .categoryEntity(new CategoryEntity())
//                    .shopEntity()
//                    .build()
//
//            );
//            categoryRepository.save(category);
        };

    }
}
