package com.mycompany;
import com.mycompany.model.Person;
import com.mycompany.model.Product;
import com.mycompany.model.Wallet;

public class Main {

    public static void main(String[] args){

        //System.out.println("test");
        Wallet w = new Wallet(500.0);
        Person p = new Person("Aris",w);
        Product bike = new Product("bike", 120);
        Product dishwasher = new Product("dishwasher", 400);

        p.purchase(bike);
        p.purchase(dishwasher);

        w.deposit(100.0);
        p.purchase(dishwasher);
    }
}
