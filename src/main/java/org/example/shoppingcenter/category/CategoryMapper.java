package org.example.shoppingcenter.category;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    void updateToDto(CategoryEntity userEntity ,@MappingTarget CategoryDto dto);

    CategoryDto toDto(CategoryEntity userEntity);
    CategoryEntity toEntity(CategoryDto dto);
    List<CategoryDto> listToDto(List<CategoryEntity> userEntityList);



}
