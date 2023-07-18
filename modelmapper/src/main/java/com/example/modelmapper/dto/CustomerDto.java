package com.example.modelmapper.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CustomerDto {
    private String customerId;
    private String firstName;
    private String lastName;

}
