package com.example.assignmentapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.assignmentapi.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer,String>{
}
