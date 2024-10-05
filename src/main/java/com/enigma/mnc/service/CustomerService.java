package com.enigma.mnc.service;

import java.util.List;
import com.enigma.mnc.model.entity.Customer;
public interface CustomerService {
    Customer create(Customer customer);
    Customer getById(String id);
    List<Customer> getAll();
    Customer update(Customer customer);
    void delete(String id);
}
