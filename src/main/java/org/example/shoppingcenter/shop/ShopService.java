package org.example.shoppingcenter.shop;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ShopService {

    ShopRepository shopRepository;

    public void create(ShopEntity shopEntity) {
        shopRepository.save(shopEntity);
    }

    public List<ShopEntity> findAll() {
        return shopRepository.findAll();
    }

    public ShopEntity findById(Long id) {
        return shopRepository.findById(id).orElse(null);

    }

}
