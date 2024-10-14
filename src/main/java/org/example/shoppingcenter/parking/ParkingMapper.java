package org.example.shoppingcenter.parking;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ParkingMapper {

    ParkingMapper INSTANCE = Mappers.getMapper(ParkingMapper.class);

    void updateToDto(ParkingEntity parking ,@MappingTarget ParkingDto dto);

    ParkingDto toDto(ParkingEntity parking);
    ParkingEntity toEntity(ParkingDto dto);
    List<ParkingDto> listToDto(List<ParkingEntity> parkingEntities);



}
