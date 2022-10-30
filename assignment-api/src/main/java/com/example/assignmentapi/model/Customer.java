package com.example.assignmentapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Customers")
public class Customer {
    
    @Id
    private String cust_id;
    private String cust_name;
    private String cust_email;
    private String cust_mobile;
    private String cust_city;

    public Customer() {
        System.out.println("Customer parameterless works!!!");
    }

    public Customer(String name, String email, String mobile, String city) {
        System.out.println("this also works!!");
        this.cust_name= name;
        this.cust_email= email;
        this.cust_mobile= mobile;
        this.cust_city= city;
    }

    public String getId() {
        return cust_id;
    }

    public void setId(String id) {
        this.cust_id= id;
    }

    public String getName() {
        return cust_name;
    }

    public void setName(String name) {
        this.cust_name= name;
    }

    public String getEmail() {
        return cust_email;
    }

    public void setEmail(String email) {
        this.cust_email= email;
    }

    public String getMobile() {
        return cust_mobile;
    }

    public void setMobile(String mobile) {
        this.cust_mobile= mobile;
    }

    public String getCity() {
        return cust_city;
    }

    public void setCity(String city) {
        this.cust_city= city;
    }

    public String toString() {
        return "Customer [ id= "+cust_id+" custname= "+cust_name+"]";
    }
}
