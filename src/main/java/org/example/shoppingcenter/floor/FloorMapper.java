package org.example.shoppingcenter.floor;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FloorMapper {

    FloorMapper INSTANCE = Mappers.getMapper(FloorMapper.class);

    void updateToDto(FloorEntity floor ,@MappingTarget FloorDto dto);

    FloorDto toDto(FloorEntity floor);
    FloorEntity toEntity(FloorDto dto);
    List<FloorDto> listToDto(List<FloorEntity> floorEntities);



}
