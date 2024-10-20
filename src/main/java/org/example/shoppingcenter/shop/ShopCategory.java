package org.example.shoppingcenter.shop;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.example.shoppingcenter.BaseDto;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum ShopCategory {
    MALE(1),
    FEMALE(2),
    KIDS(3),
    SPORT(4),
    ;

    Integer code;


}
