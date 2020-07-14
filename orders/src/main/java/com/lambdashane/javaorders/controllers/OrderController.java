package com.lambdashane.javaorders.controllers;

import com.lambdashane.javaorders.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/orders")
public class OrderController
{
    @Autowired
    private OrderServices orderServices;

    //    http://localhost:2019/orders/order/7
}
