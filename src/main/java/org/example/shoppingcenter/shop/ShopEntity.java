package org.example.shoppingcenter.shop;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.shoppingcenter.BaseEntity;
import org.example.shoppingcenter.category.CategoryEntity;
import org.example.shoppingcenter.floor.FloorEntity;
import org.example.shoppingcenter.product.ProductEntity;
import org.example.shoppingcenter.seller.SellerEntity;
import org.example.shoppingcenter.shoppingcenter.ShoppingCenterEntity;

import java.util.List;

@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShopEntity extends BaseEntity {

    String name;
    String type;

    @ManyToOne
    CategoryEntity category;
    @ManyToOne
    FloorEntity floor;
    @OneToMany(mappedBy = "shop")
    List<SellerEntity> sellers;
    @OneToMany(mappedBy = "shop")
    List<ProductEntity> products;
    @ManyToOne
    ShoppingCenterEntity shoppingCenter;


}
