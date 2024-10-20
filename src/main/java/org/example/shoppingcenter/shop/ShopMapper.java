package org.example.shoppingcenter.shop;

import org.example.shoppingcenter.BaseMapper;
import org.example.shoppingcenter.product.ProductDto;
import org.example.shoppingcenter.product.ProductEntity;
import org.example.shoppingcenter.product.ProductMapper;
import org.example.shoppingcenter.seller.SellerDto;
import org.example.shoppingcenter.seller.SellerEntity;
import org.example.shoppingcenter.seller.SellerMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ShopMapper extends BaseMapper<ShopEntity, ShopDto> {
    ShopMapper INSTANCE = Mappers.getMapper(ShopMapper.class);

    default SellerDto sellerDto(SellerEntity entity) {
        return Mappers.getMapper(SellerMapper.class).toDto(entity);
    }

    default SellerEntity sellerEntity(SellerDto dto) {
        return Mappers.getMapper(SellerMapper.class).toEntity(dto);
    }

    default ProductDto productDto(ProductEntity entity) {
        return Mappers.getMapper(ProductMapper.class).toDto(entity);
    }

    default ProductEntity productEntity(ProductDto dto) {
        return Mappers.getMapper(ProductMapper.class).toEntity(dto);
    }

}

