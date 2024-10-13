package org.example.shoppingcenter.shoppingcenter;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE , makeFinal = true)
@RequiredArgsConstructor
public class ShoppingCenterService {

    ShoppingCenterRepository shoppingCenterRepository;

    public void create(ShoppingCenterEntity shoppingCenterEntity) {
        shoppingCenterRepository.save(shoppingCenterEntity);
    }

    public ShoppingCenterEntity findById(Long id) {
        Optional<ShoppingCenterEntity> byId = shoppingCenterRepository.findById(id);
        return byId.orElse(null);
    }









}
