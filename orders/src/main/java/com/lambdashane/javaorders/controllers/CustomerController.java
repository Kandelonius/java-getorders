package com.lambdashane.javaorders.controllers;

import com.lambdashane.javaorders.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController
{
    @Autowired
    private CustomerServices customerServices;

//    http://localhost:2019/customers/orders

//    http://localhost:2019/customers/customer/7

//    http://localhost:2019/customers/customer/77

//    http://localhost:2019/customers/namelike/mes

//    http://localhost:2019/customers/namelike/cin

}
