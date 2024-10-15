package org.example.shoppingcenter.shoppingcenter;

import org.example.shoppingcenter.BaseMapper;
import org.example.shoppingcenter.shop.ShopDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ShoppingCenterMapper extends BaseMapper<ShoppingCenterEntity, ShoppingCenterDto> {

    ShoppingCenterMapper INSTANCE = Mappers.getMapper(ShoppingCenterMapper.class);


}


