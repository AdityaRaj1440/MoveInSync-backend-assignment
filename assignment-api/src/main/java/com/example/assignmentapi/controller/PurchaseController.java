package com.example.assignmentapi.controller;

import com.example.assignmentapi.model.Purchase;
import com.example.assignmentapi.model.Customer;
import com.example.assignmentapi.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PurchaseController {
    @Autowired
    private PurchaseRepository repo;
    @Autowired
    private CustomerRepository custRepo;

    @PostMapping("/addPurchase")
    public String addPurchase(@RequestBody Purchase purchase) {
        if(custRepo.findById(purchase.getCustomerID())==null) 
        {
            return "Customer Does not Exist!!";
        }
        else
            repo.save(purchase);
        return "Purchase added successfully!";
    }

    @GetMapping("/findAllPurchases")
    public List<Purchase> getPurchases() {
            return repo.findAll();
    }

    @DeleteMapping("/deletePuchase/{id}")
    public String removePurchase(@PathVariable("id") String id) {
        repo.deleteById(""+id);
        return "purchase details removed successfully";
    }
}
