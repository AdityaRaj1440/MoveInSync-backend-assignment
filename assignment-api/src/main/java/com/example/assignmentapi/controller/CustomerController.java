package com.example.assignmentapi.controller;

import com.example.assignmentapi.model.*;
import com.example.assignmentapi.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    
    @Autowired
    private CustomerRepository repo;

    @PostMapping("/addCustomer")
    public String addCustomer(@RequestBody Customer customer) {
        repo.save(customer);
        return "Customer added successfully!";
    }

    @GetMapping("/findAllCustomers")
    public List<Customer> getCustomers() {
        return repo.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public String removeCustomer(@PathVariable int id) {
        repo.deleteById(""+id);
        return "customer removed successfully";
    }

}
