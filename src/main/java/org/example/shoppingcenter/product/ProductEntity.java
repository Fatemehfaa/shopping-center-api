package org.example.shoppingcenter.product;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.shoppingcenter.BaseEntity;
import org.example.shoppingcenter.category.CategoryEntity;
import org.example.shoppingcenter.shop.ShopEntity;

@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductEntity extends BaseEntity {

    String title;
    String description;
    Double price;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    ShopEntity shop;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    CategoryEntity category;


}
