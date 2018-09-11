package com.example.demo.service.inf;

import com.example.demo.model.Customer;

import java.util.List;

public interface ICustomer {
    void addAutoId(Customer customer);
    void add(Customer customer);
    Customer update(Customer customer);
    void delete(int id);
    Customer findOne(int id);
    List<Customer> findAll();
}
