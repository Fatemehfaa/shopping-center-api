package org.example.shoppingcenter.shop;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import org.example.shoppingcenter.BaseDto;
import org.example.shoppingcenter.floor.FloorDto;
import org.example.shoppingcenter.product.ProductDto;
import org.example.shoppingcenter.seller.SellerDto;

import java.util.List;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ShopDto extends BaseDto {
    String name;
    ShopType type;

    FloorDto floor;
    List<SellerDto> sellers;
    List<ProductDto> products;


}
