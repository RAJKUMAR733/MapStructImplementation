package com.example.modelmapper.controller;

import com.example.modelmapper.dto.CustomerDto;
import com.example.modelmapper.entity.Customer;
import com.example.modelmapper.serviceImpl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private ServiceImpl serviceImpl;

    @PostMapping
    ResponseEntity<String>getCustomerDetails()
    {
        CustomerDto customerDto=serviceImpl.getCustomerDtoDetails(new Customer());
        System.out.println(customerDto.toString());
        return ResponseEntity.ok("Sucessfully");
    }

}
