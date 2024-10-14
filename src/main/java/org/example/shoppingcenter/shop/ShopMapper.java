package org.example.shoppingcenter.shop;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ShopMapper {

    ShopMapper INSTANCE = Mappers.getMapper(ShopMapper.class);

    void updateToDto(ShopEntity shop , @MappingTarget ShopDto dto);

    ShopDto toDto(ShopEntity shop);
    ShopEntity toEntity(ShopDto dto);
    List<ShopDto> listToDto(List<ShopEntity> shopEntities);



}

