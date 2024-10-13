package org.example.shoppingcenter.shop;

import jakarta.persistence.Entity;
import jdk.jfr.Category;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.example.shoppingcenter.BaseEntity;
import org.example.shoppingcenter.category.CategoryEntity;
import org.example.shoppingcenter.floor.FloorEntity;
import org.example.shoppingcenter.product.ProductEntity;
import org.example.shoppingcenter.seller.SellerEntity;

import java.util.List;

@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ShopEntity extends BaseEntity<Long> {

    String name;
    String type;


    CategoryEntity category;
    FloorEntity floor;
    List<SellerEntity> sellers;
    List<ProductEntity> products;


}
