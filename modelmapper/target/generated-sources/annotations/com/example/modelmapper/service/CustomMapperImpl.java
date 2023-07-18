package com.example.modelmapper.service;

import com.example.modelmapper.dto.CustomerDto;
import com.example.modelmapper.entity.Customer;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-17T14:56:12+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class CustomMapperImpl implements CustomMapper {

    @Override
    public CustomerDto getCustomerDtoDetails(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDto customerDto = new CustomerDto();

        customerDto.setCustomerId( customer.getCustomerId() );
        customerDto.setLastName( customer.getLastName() );

        return customerDto;
    }

    @Override
    public Customer getCustomerDetails(CustomerDto customerDto) {
        if ( customerDto == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setCustomerId( customerDto.getCustomerId() );
        customer.setLastName( customerDto.getLastName() );

        return customer;
    }
}
