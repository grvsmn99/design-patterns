package com.gaurav.pattern.adapterpattern.existingClasses;

public class Stripe {

    public void chargeCustomer(String cardNumber, double amount){
        System.out.println("Charge of $" + amount + " made to Stripe card " + cardNumber);
    }
}
