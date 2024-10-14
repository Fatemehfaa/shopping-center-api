package org.example.shoppingcenter.shoppingcenter;


import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ShoppingCenterService {

    ShoppingCenterRepository shoppingCenterRepository;

    public ShoppingCenterDto create(ShoppingCenterDto shoppingCenter) {
        ShoppingCenterEntity entity = ShoppingCenterMapper.INSTANCE.toEntity(shoppingCenter);
        return ShoppingCenterMapper.INSTANCE.toDto(shoppingCenterRepository.save(entity));
    }

    public ShoppingCenterDto findById(Long id) {
        return ShoppingCenterMapper.INSTANCE.toDto(shoppingCenterRepository.findById(id).orElse(null));
    }

    public ShoppingCenterDto update(ShoppingCenterDto shoppingCenterDto) {
        ShoppingCenterEntity shoppingCenter = shoppingCenterRepository.findById(shoppingCenterDto.getId()).orElseThrow();
        ShoppingCenterMapper.INSTANCE.updateToDto(shoppingCenter, shoppingCenterDto);
        return ShoppingCenterMapper.INSTANCE.toDto(shoppingCenterRepository.save(shoppingCenter));
    }

    public void delete(Long id) {
        shoppingCenterRepository.deleteById(id);
    }

    public List<ShoppingCenterDto> findAll() {
        return ShoppingCenterMapper.INSTANCE.listToDto(shoppingCenterRepository.findAll());
    }
}





