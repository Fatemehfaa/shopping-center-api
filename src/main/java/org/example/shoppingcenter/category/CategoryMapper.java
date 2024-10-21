package org.example.shoppingcenter.category;

import jdk.jfr.Category;
import org.example.shoppingcenter.BaseMapper;
import org.example.shoppingcenter.product.ProductDto;
import org.example.shoppingcenter.product.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper extends BaseMapper<CategoryEntity, CategoryDto> {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);


}
