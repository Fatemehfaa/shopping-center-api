package org.example.shoppingcenter.seller;

import org.example.shoppingcenter.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SellerMapper extends BaseMapper<SellerEntity, SellerDto> {

    SellerMapper INSTANCE = Mappers.getMapper(SellerMapper.class);

}
