package org.example.shoppingcenter.shop;

import org.example.shoppingcenter.BaseMapper;
import org.example.shoppingcenter.floor.FloorDto;
import org.example.shoppingcenter.floor.FloorEntity;
import org.example.shoppingcenter.floor.FloorMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface ShopMapper extends BaseMapper<ShopEntity, ShopDto> {

    ShopMapper INSTANCE = Mappers.getMapper(ShopMapper.class);

    default FloorDto floorToFloorDto(FloorEntity floorEntity) {
        return FloorMapper.INSTANCE.toDto(floorEntity);
    }


    default FloorEntity floorToFloorEntity(FloorDto floorDto) {
        return FloorMapper.INSTANCE.toEntity(floorDto);
    }
}

