package com.ut.bankapp.repository;

import com.ut.bankapp.exceptions.CustomerNotFoundExceptions;
import com.ut.bankapp.models.Customers;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class CustomerRepository{

    private HashMap<Integer, Customers> customerDetails = new HashMap<>();


    public Customers addCustomer(Customers customer){
        customerDetails.put(customer.getId(), customer);
        return customerDetails.get(customer.getId());
    }

    public List<Customers> getAllCustomers(){
        return customerDetails.values().stream().toList();
    }


    public Customers getCustomer(int id){
        return customerDetails.get(id);
    }

    public Customers updateCustomer(Customers customer){
        int custId = customer.getId();
        if(!customerDetails.containsKey(custId)){
            throw new CustomerNotFoundExceptions();
        }

        Customers existingCustomer = customerDetails.get(custId);
        existingCustomer.setName(customer.getName());
        existingCustomer.setAccount(customer.getAccount());
        customerDetails.put(custId, existingCustomer);
        return customerDetails.get(custId);
    }

    public Customers deleteCustomer(int custId){
        return customerDetails.remove(custId);
    }


}
