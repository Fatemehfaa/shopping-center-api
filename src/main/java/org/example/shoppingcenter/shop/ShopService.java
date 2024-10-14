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

    public ShopDto create(ShopDto shop) {
        ShopEntity entity = ShopMapper.INSTANCE.toEntity(shop);
        return ShopMapper.INSTANCE.toDto(shopRepository.save(entity));
    }

    public ShopDto findById(Long id) {
        return ShopMapper.INSTANCE.toDto(shopRepository.findById(id).orElse(null));
    }

    public ShopDto update(ShopDto shopDto) {
        ShopEntity shop = shopRepository.findById(shopDto.getId()).orElseThrow();
        ShopMapper.INSTANCE.updateToDto(shop, shopDto);
        return ShopMapper.INSTANCE.toDto(shopRepository.save(shop));
    }

    public void delete(Long id) {
        shopRepository.deleteById(id);
    }

    public List<ShopDto> findAll() {
        return ShopMapper.INSTANCE.listToDto(shopRepository.findAll());
    }
}

