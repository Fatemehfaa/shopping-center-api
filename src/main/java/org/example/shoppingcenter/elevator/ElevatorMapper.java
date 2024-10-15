package org.example.shoppingcenter.elevator;

import org.example.shoppingcenter.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ElevatorMapper extends BaseMapper<ElevatorEntity, ElevatorDto> {

    ElevatorMapper INSTANCE = Mappers.getMapper(ElevatorMapper.class);

}
