package com.lambdashane.javaorders.services;

import com.lambdashane.javaorders.models.Customer;
import com.lambdashane.javaorders.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "customerService")
public class CustomerServicesImpl implements CustomerServices
{
    @Autowired
    private CustomersRepository custrepos;

    @Transactional
    @Override
    public Customer save(Customer restaurant)
    {
        return custrepos.save(restaurant);
    }

    @Override
    public List<Customer> findAllCustomers()
    {
        List<Customer> rtnlList = new ArrayList<>();

        custrepos.findAll()
            .iterator()
            .forEachRemaining(rtnlList::add);

        return rtnlList;
    }
}
