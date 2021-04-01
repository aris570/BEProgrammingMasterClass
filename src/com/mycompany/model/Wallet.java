package com.mycompany.model;

public class Wallet {

    private double totalAmount;

    public Wallet(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void deposit(double amount){
        totalAmount+=amount;
        System.out.println("New amount after deposit is :"+this.getTotalAmount());
    }

}
