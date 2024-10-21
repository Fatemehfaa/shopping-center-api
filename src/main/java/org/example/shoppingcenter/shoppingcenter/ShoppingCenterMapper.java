package org.example.shoppingcenter.shoppingcenter;

import org.example.shoppingcenter.BaseMapper;
import org.example.shoppingcenter.seller.SellerDto;
import org.example.shoppingcenter.seller.SellerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface ShoppingCenterMapper extends BaseMapper<ShoppingCenterEntity, ShoppingCenterDto> {

    ShoppingCenterMapper INSTANCE = Mappers.getMapper(ShoppingCenterMapper.class);

}


