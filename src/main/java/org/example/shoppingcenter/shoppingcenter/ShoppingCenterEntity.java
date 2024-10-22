package org.example.shoppingcenter.shoppingcenter;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import org.example.shoppingcenter.BaseEntity;
import org.example.shoppingcenter.shop.ShopEntity;

import java.util.List;

@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCenterEntity extends BaseEntity {

    String name;
    String location;

    @OneToMany(mappedBy = "shoppingCenter")
    List<ShopEntity> shops;


}
