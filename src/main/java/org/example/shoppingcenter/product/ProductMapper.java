package org.example.shoppingcenter.product;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    void updateToDto(ProductEntity product ,@MappingTarget ProductDto dto);

    ProductDto toDto(ProductEntity product);
    ProductEntity toEntity(ProductDto dto);
    List<ProductDto> listToDto(List<ProductEntity> productEntities);


}
