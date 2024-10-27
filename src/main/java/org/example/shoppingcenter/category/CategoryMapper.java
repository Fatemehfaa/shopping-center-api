package org.example.shoppingcenter.category;

import org.example.shoppingcenter.BaseMapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface CategoryMapper extends BaseMapper<CategoryEntity, CategoryDto> {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);


}
