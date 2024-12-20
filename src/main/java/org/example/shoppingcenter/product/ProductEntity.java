package org.example.shoppingcenter.product;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import org.example.shoppingcenter.BaseEntity;
import org.example.shoppingcenter.category.CategoryEntity;
import org.example.shoppingcenter.shop.ShopEntity;

@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ProductEntity extends BaseEntity {

    String title;
    String description;
    Double price;

    @ManyToOne(fetch = FetchType.EAGER)
    ShopEntity shop;
    @ManyToOne(fetch = FetchType.EAGER)
    CategoryEntity category;


}
