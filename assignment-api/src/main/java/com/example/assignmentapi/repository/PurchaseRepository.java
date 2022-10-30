package com.example.assignmentapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.assignmentapi.model.Purchase;


public interface PurchaseRepository extends MongoRepository<Purchase,String>{
}
