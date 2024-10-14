package org.example.shoppingcenter.product;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
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
public class ProductEntity extends BaseEntity {

    String title;
    String description;
    Double price;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    ShopEntity shopEntity;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    CategoryEntity categoryEntity;


}
