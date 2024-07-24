package com.gaurav.pattern.adapterpattern.adapterClasses;

import com.gaurav.pattern.adapterpattern.existingClasses.Stripe;
import com.gaurav.pattern.adapterpattern.expectedInterfacebyclient.PaymentProcessor;

public class StripeAdapter implements PaymentProcessor {

    private Stripe stripe;

    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void pay(String account, double amount) {
        stripe.chargeCustomer(account, amount);
    }
}
