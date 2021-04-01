package com.mycompany.model;
import com.mycompany.model.Wallet;
import com.mycompany.model.Product;

public class Person {
    private String name;
    private Wallet wallet;

    public Person(String name, Wallet wallet) {
        this.name = name;
        this.wallet=wallet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void purchase(Product p){
        if (wallet.getTotalAmount() >= p.getPrice()){
            wallet.setTotalAmount(wallet.getTotalAmount() - p.getPrice());
            System.out.println("Purchase successful! New balance is: $"+wallet.getTotalAmount());
        }else {
            System.out.println("Insufficient balance! Additional amount of $"+(p.getPrice()-wallet.getTotalAmount())+" is required");
        }
    }
}
