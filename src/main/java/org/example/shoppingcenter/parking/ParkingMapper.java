package org.example.shoppingcenter.parking;

import org.example.shoppingcenter.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ParkingMapper extends BaseMapper<ParkingEntity, ParkingDto> {

    ParkingMapper INSTANCE = Mappers.getMapper(ParkingMapper.class);


}
