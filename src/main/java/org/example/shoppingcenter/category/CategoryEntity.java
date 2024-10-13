package org.example.shoppingcenter.category;

import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.example.shoppingcenter.BaseEntity;
import org.example.shoppingcenter.product.ProductEntity;

import java.util.List;

@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CategoryEntity extends BaseEntity<Long> {
    String name;

    List<CategoryEntity> subCategories;
    List<ProductEntity> products;


}