package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.model.TbUser;
import com.example.demo.service.CustomerService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
//    @Autowired
//    private UserService userService;

    @Autowired
    private CustomerService customerService;


    @PostMapping("")
    public Customer add(Customer customer){
        customerService.add(customer);
        return customer;
    }
    @GetMapping("{id}")
    public Customer getUserById(@PathVariable("id") Integer id){
        Customer customer=customerService.findOne(id);
        return customer;
    }

    @PutMapping()
//    @PutMapping("update")
    public String updateById(@RequestBody Customer customer){
        customerService.update(customer);
        return "success";
    }
    @DeleteMapping("{id}")
//    @PutMapping("update")
    public String deleteById(@PathVariable("id") Integer id){
        customerService.delete(id);
        return "success";
    }
    @GetMapping("getAll")
//    @PutMapping("update")
    public List<Customer> getAll(){
        return customerService.findAll();
    }
}
