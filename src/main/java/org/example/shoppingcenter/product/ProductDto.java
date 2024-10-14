package org.example.shoppingcenter.product;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import org.example.shoppingcenter.BaseDto;
import org.example.shoppingcenter.category.CategoryDto;
import org.example.shoppingcenter.shop.ShopDto;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ProductDto extends BaseDto {

    String title;
    String description;
    Double price;

    ShopDto shopDto;
    CategoryDto categoryDto;


}
