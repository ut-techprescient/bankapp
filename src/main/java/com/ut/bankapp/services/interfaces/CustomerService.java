package com.ut.bankapp.services.interfaces;

import com.ut.bankapp.models.Customers;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CustomerService {
    List<Customers> getCustomers();
    Customers getCustomer(int customerId);
    Customers createCustomer(Customers customer);
    Customers updateCustomer(Customers customer);
    Customers deleteCustomer(int customerId);

}
