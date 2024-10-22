package org.example.shoppingcenter.seller;

import org.example.shoppingcenter.BaseMapper;
import org.example.shoppingcenter.shop.ShopDto;
import org.example.shoppingcenter.shop.ShopEntity;
import org.example.shoppingcenter.shop.ShopMapper;
import org.mapstruct.Mapper;

import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SellerMapper extends BaseMapper<SellerEntity, SellerDto> {

    SellerMapper INSTANCE = Mappers.getMapper(SellerMapper.class);

    default ShopEntity toShopEntity(ShopDto shopDto) {
       return ShopMapper.INSTANCE.toEntity(shopDto);
    }


    default ShopDto toShopDto(ShopEntity shopEntity) {
        return ShopMapper.INSTANCE.toDto(shopEntity);
    }

}
