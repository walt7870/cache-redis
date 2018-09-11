package com.example.demo.dao;

import com.example.demo.model.Customer;

import java.util.List;

public interface CustomerMapper {
    Customer getCustomerById(Integer id);
    void deleteCustomerById(Integer id);
    Customer updateByPrimaryKeySelective(Customer customer);
    List<Customer> findAll();
    void insertCustomerAutoId(Customer customer);
    void insertCustomer(Customer customer);
}
