package org.example.shoppingcenter.product;

import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.example.shoppingcenter.BaseEntity;
import org.example.shoppingcenter.category.CategoryEntity;
import org.example.shoppingcenter.shop.ShopEntity;

@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductEntity extends BaseEntity<Long> {

    String title;
    String description;
    Double price;

    ShopEntity shopEntity;
    CategoryEntity categoryEntity;


}
