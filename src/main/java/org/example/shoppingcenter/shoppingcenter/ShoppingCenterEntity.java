package org.example.shoppingcenter.shoppingcenter;

import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.example.shoppingcenter.BaseEntity;
import org.example.shoppingcenter.shop.ShopEntity;

import java.util.List;

@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ShoppingCenterEntity extends BaseEntity<Long> {

    String name;
    String location;

    List<ShopEntity> shops;


}
