package com.example.assignmentapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Purchases")
public class Purchase {

    @Id
    private String purchase_id;
    private String product_name;
    private String product_quantity;
    private String product_pricing;
    private String product_mrp;
    private String customer_id;

    public Purchase() {
    }

    public Purchase(String name, String quantity, String pricing, String mrp, String custid) {
        System.out.println("["+name+","+quantity+","+pricing+","+mrp+","+custid);
        this.product_name= name;
        this.product_quantity= quantity;
        this.product_pricing= pricing;
        this.product_mrp= mrp;
        this.customer_id= custid;
    }

    public String getPurchaseId() {
        return purchase_id;
    }

    public void setPurchaseId(String purchase_id) {
        this.purchase_id= purchase_id;
    }

    public String getProductName() {
        return product_name;
    }

    public void setProductName(String name) {
        this.product_name= name;
    }

    public String getProductQuantity() {
        return product_quantity;
    }

    public void setProductQuantity(String quantity) {
        this.product_quantity= quantity;
    }

    public String getProductPricing() {
        return product_pricing;
    }

    public void setProductPricing(String price) {
        this.product_pricing= price;
    }

    public String getProductMRP() {
        return product_mrp;
    }

    public void setProductMRP(String mrp) {
        this.product_mrp= mrp;
    }

    public String getCustomerID() {
        return customer_id;
    }

    @Override
    public String toString() {
        return "Purchase [customerId= "+ customer_id + ", product= " + product_name 
                            + "quantity= "+product_quantity+" price= "+product_pricing+" mrp="+product_mrp+"]";
    }
}
