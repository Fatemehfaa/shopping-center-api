package org.example.shoppingcenter.shoppingcenter;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ShoppingCenterMapper {

   ShoppingCenterMapper INSTANCE = Mappers.getMapper(ShoppingCenterMapper.class);

    void updateToDto(ShoppingCenterEntity shoppingCenter , @MappingTarget ShoppingCenterDto dto);

    ShoppingCenterDto toDto(ShoppingCenterEntity shoppingCenter);
    ShoppingCenterEntity toEntity(ShoppingCenterDto dto);
    List<ShoppingCenterDto> listToDto(List<ShoppingCenterEntity> shoppingCenterEntities);


}


