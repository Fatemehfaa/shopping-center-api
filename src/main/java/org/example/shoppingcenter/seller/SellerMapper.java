package org.example.shoppingcenter.seller;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SellerMapper {

    SellerMapper INSTANCE = Mappers.getMapper(SellerMapper.class);

    void updateToDto(SellerEntity seller , @MappingTarget SellerDto dto);

    SellerDto toDto(SellerEntity seller);
    SellerEntity toEntity(SellerDto dto);
    List<SellerDto> listToDto(List<SellerEntity> sellerEntities);



}
