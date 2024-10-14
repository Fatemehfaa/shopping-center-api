package org.example.shoppingcenter.customer;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    void updateToDto(CustomerEntity customer ,@MappingTarget CustomerDto dto);

    CustomerDto toDto(CustomerEntity customer);
    CustomerEntity toEntity(CustomerDto dto);
    List<CustomerDto> listToDto(List<CustomerEntity> customerEntities);



}
