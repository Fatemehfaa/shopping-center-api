package org.example.shoppingcenter.seller;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import org.example.shoppingcenter.BaseDto;
import org.example.shoppingcenter.product.ProductDto;

import java.util.List;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class SellerDto extends BaseDto {

    String name;
    List<ProductDto> products;
}
