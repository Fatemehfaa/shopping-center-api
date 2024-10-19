package org.example.shoppingcenter.seller;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.shoppingcenter.BaseEntity;
import org.example.shoppingcenter.product.ProductEntity;
import org.example.shoppingcenter.shop.ShopEntity;

import java.util.List;

@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SellerEntity extends BaseEntity {

    String name;

    @ManyToOne
    @JoinColumn(nullable = false)
    ShopEntity shop;
}
