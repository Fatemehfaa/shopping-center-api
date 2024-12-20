package org.example.shoppingcenter.seller;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import org.example.shoppingcenter.BaseEntity;
import org.example.shoppingcenter.product.ProductEntity;
import org.example.shoppingcenter.shop.ShopEntity;

import java.util.List;

@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class SellerEntity extends BaseEntity {

    String name;

    @ManyToOne
    @JoinColumn(nullable = false)
    ShopEntity shop;
}
