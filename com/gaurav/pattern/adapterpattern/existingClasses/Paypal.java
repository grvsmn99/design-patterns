package com.gaurav.pattern.adapterpattern.existingClasses;

public class Paypal {

    public void makePayment(String email, double amount){
        System.out.println("Payment of $" + amount + " made using PayPal account " + email);
    }
}
