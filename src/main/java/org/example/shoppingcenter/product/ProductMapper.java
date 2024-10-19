package org.example.shoppingcenter.product;

import org.example.shoppingcenter.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper extends BaseMapper<ProductEntity, ProductDto> {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Override
    @Mapping(target = "shop.products", ignore = true)
    ProductDto toDto(ProductEntity entity);

    @Override
    @Mapping(target = "shop.products", ignore = true)
    ProductEntity toEntity(ProductDto dto);
}
