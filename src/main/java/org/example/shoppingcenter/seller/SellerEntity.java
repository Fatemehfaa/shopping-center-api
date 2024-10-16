package org.example.shoppingcenter.seller;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
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
public class SellerEntity extends BaseEntity {

    String name;

    @ManyToMany
    List<ProductEntity> products;
}
