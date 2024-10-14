package org.example.shoppingcenter.elevator;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ElevatorMapper {

    ElevatorMapper INSTANCE = Mappers.getMapper(ElevatorMapper.class);

    void updateToDto(ElevatorEntity elevator ,@MappingTarget ElevatorDto dto);

    ElevatorDto toDto(ElevatorEntity elevator);
    ElevatorEntity toEntity(ElevatorDto dto);
    List<ElevatorDto> listToDto(List<ElevatorEntity> elevatorEntities);



}
