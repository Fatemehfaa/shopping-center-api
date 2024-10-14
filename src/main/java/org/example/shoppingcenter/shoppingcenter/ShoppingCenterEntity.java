package org.example.shoppingcenter.shoppingcenter;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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

    @OneToMany(mappedBy = "shoppingCenter")
    List<ShopEntity> shops;


}
