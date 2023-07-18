package com.example.modelmapper.serviceImpl;

import com.example.modelmapper.dto.CustomerDto;
import com.example.modelmapper.entity.Customer;
import com.example.modelmapper.service.CustomMapper;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl {

    public CustomerDto getCustomerDtoDetails(Customer customer)
    {
        customer.setCustomerId("1234");
        customer.setLastName("XYZ");
        customer.setFirtsName("ABC");
        CustomerDto customerDto= CustomMapper.customMapper.getCustomerDtoDetails(customer);
        return customerDto;
    }

}
