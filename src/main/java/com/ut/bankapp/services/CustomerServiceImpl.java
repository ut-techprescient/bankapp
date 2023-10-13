package com.ut.bankapp.services;

import com.ut.bankapp.models.Customers;
import com.ut.bankapp.repository.CustomerRepository;
import com.ut.bankapp.services.interfaces.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public List<Customers> getCustomers() {
        return customerRepository.getAllCustomers();
    }

    @Override
    public Customers getCustomer(int customerId) {
        return customerRepository.getCustomer(customerId);
    }

    @Override
    public Customers createCustomer(Customers customer) {
        return customerRepository.addCustomer(customer);
    }

    @Override
    public Customers updateCustomer(Customers customer) {
        return customerRepository.updateCustomer(customer);
    }

    @Override
    public Customers deleteCustomer(int customerId) {
        return customerRepository.deleteCustomer(customerId);
    }
}
