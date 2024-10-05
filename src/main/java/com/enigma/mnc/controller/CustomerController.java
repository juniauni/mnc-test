package com.enigma.mnc.controller;

import com.enigma.mnc.constant.AppPath;
import com.enigma.mnc.model.entity.Customer;
import com.enigma.mnc.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(AppPath.CUSTOMER)
public class CustomerController {
    private final CustomerService customerService;
    @GetMapping
    public List<Customer> getAllCustomer() {
        return customerService.getAll();
    }

    @GetMapping(AppPath.GET_BY_ID)
    public Customer getCustomerById(@PathVariable String id){
        return customerService.getById(id);
    }

    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer){
        return customerService.update(customer);
    }

    @DeleteMapping(AppPath.GET_BY_ID)
    public void deleteCustomer(@PathVariable String id){
        customerService.delete(id);
    }
}
