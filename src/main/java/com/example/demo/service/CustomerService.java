package com.example.demo.service;

import com.example.demo.dao.AnnoCustomerMapper;
import com.example.demo.dao.CustomerMapper;
import com.example.demo.model.Customer;
import com.example.demo.service.inf.ICustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomer {
    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private AnnoCustomerMapper annoCustomerMapper;

    @Override
    public void addAutoId(Customer customer) {
        customerMapper.insertCustomerAutoId(customer);
    }

    @Override
    public void add(Customer customer) {

//        customerMapper.insertCustomer(customer);
        annoCustomerMapper.insert(customer);
    }

    @Override
//    @CacheEvict(value = "customer",keyGenerator = "keyGenerator")
    @CachePut(value = "customer",key = "#p0.id")
    public Customer update(Customer customer) {
        return customerMapper.updateByPrimaryKeySelective(customer);
    }

    @Override
//    @CacheEvict(value = "customer",keyGenerator = "keyGenerator")
    @CacheEvict(value = "customer",key = "#p0")
    public void delete(int id) {
        customerMapper.deleteCustomerById(id);
    }

    @Override
//    @Cacheable(value = "customer",keyGenerator = "keyGenerator")
    @Cacheable(value = "customer",key= "#p0")
    public Customer findOne(int id) {
        return customerMapper.getCustomerById(id);
    }

    @Override
    public List<Customer> findAll() {
        return customerMapper.findAll();
    }
}
