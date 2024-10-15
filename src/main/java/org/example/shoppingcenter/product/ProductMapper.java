package org.example.shoppingcenter.product;

import org.example.shoppingcenter.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper extends BaseMapper<ProductEntity, ProductDto> {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);


}
