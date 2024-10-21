package org.example.shoppingcenter.shop;

import org.example.shoppingcenter.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface ShopMapper extends BaseMapper<ShopEntity, ShopDto> {

    ShopMapper INSTANCE = Mappers.getMapper(ShopMapper.class);

}

