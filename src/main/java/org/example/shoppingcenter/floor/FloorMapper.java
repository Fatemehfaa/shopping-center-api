package org.example.shoppingcenter.floor;

import org.example.shoppingcenter.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FloorMapper extends BaseMapper<FloorEntity, FloorDto> {

    FloorMapper INSTANCE = Mappers.getMapper(FloorMapper.class);

}
