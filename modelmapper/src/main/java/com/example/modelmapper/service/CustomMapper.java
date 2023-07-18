package com.example.modelmapper.service;

import com.example.modelmapper.dto.CustomerDto;
import com.example.modelmapper.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CustomMapper {

    CustomMapper customMapper= Mappers.getMapper(CustomMapper.class);

    CustomerDto getCustomerDtoDetails(Customer customer);
    Customer getCustomerDetails(CustomerDto customerDto);


}
