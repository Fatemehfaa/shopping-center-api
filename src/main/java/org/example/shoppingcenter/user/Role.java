package org.example.shoppingcenter.user;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum Role {
    CUSTOMER(1),
    USER(2),
    ADMIN(3),
    SELLER(4);

    Integer code;


}
