package org.example.shoppingcenter.shop;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum ShopType {
    HYPER(1),
    STORE(2),
    BOOTH(3);

    Integer code;
}
