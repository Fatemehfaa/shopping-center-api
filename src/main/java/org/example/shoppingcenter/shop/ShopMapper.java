package org.example.shoppingcenter.shop;

import org.example.shoppingcenter.BaseMapper;
import org.example.shoppingcenter.product.ProductDto;
import org.example.shoppingcenter.product.ProductEntity;
import org.example.shoppingcenter.product.ProductMapper;
import org.example.shoppingcenter.seller.SellerDto;
import org.example.shoppingcenter.seller.SellerEntity;
import org.example.shoppingcenter.seller.SellerMapper;
import org.example.shoppingcenter.shoppingcenter.ShoppingCenterDto;
import org.example.shoppingcenter.shoppingcenter.ShoppingCenterEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ShopMapper extends BaseMapper<ShopEntity, ShopDto> {
    ShopMapper INSTANCE = Mappers.getMapper(ShopMapper.class);


    @Override
    @Mapping(target = "sellers.shop", ignore = true)
    ShopDto toDto(ShopEntity entity);

    @Override
    @Mapping(target = "sellers.shop", ignore = true)
    ShopEntity toEntity(ShopDto dto);


    @Mapping(target = "products.shop", ignore = true)
    ProductDto toDto(ProductEntity entity);

    @Mapping(target = "products.shop", ignore = true)
    ProductEntity toEntity(ProductDto dto);


    @Mapping(target = "shoppingCenter.shops", ignore = true)
    ShoppingCenterDto toDto(ShoppingCenterEntity entity);

    @Mapping(target = "shoppingCenter.shops", ignore = true)
    ShoppingCenterEntity toEntity(ShoppingCenterDto dto);






//
//    default SellerDto sellerDto(SellerEntity entity) {
//        return Mappers.getMapper(SellerMapper.class).toDto(entity);
//    }
//
//    default SellerEntity sellerEntity(SellerDto dto) {
//        return Mappers.getMapper(SellerMapper.class).toEntity(dto);
//    }
//
//    default ProductDto productDto(ProductEntity entity) {
//        return Mappers.getMapper(ProductMapper.class).toDto(entity);
//    }
//
//    default ProductEntity productEntity(ProductDto dto) {
//        return Mappers.getMapper(ProductMapper.class).toEntity(dto);
//    }

}

