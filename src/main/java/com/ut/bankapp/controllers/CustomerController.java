package com.ut.bankapp.controllers;


import com.ut.bankapp.models.Customers;
import com.ut.bankapp.services.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    @Autowired
    private CustomerServiceImpl customerService;

    @GetMapping
    public List<Customers> getAllCustomers(){
        return customerService.getCustomers();
    }

    @PostMapping
    public Customers addCustomer(@RequestBody Customers customer){
        return customerService.createCustomer(customer);
    }

    @GetMapping("{id}")
    public Customers getCustomer(@PathVariable(required = true) int id){
        return customerService.getCustomer(id);
    }

    @PutMapping
    public Customers updateCustomer(@RequestBody Customers customer){
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping("{customerId}")
    public Customers deleteCustomer(@PathVariable(required = true) int customerId){
        return customerService.deleteCustomer(customerId);
    }

}
