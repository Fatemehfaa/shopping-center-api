package org.example.shoppingcenter.shop;

import org.example.shoppingcenter.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ShopMapper extends BaseMapper<ShopEntity, ShopDto> {
    ShopMapper INSTANCE = Mappers.getMapper(ShopMapper.class);


}

