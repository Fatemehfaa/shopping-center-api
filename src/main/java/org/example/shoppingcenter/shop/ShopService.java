package org.example.shoppingcenter.shop;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE , makeFinal = true)
@RequiredArgsConstructor
public class ShopService {

    ShopRepository shopRepository;

    public void createShop(ShopEntity shopEntity) {
        shopRepository.save(shopEntity);
    }

}
