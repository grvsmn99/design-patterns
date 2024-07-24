package com.gaurav.pattern.adapterpattern.adapterClasses;

import com.gaurav.pattern.adapterpattern.existingClasses.Paypal;
import com.gaurav.pattern.adapterpattern.expectedInterfacebyclient.PaymentProcessor;

public class PaypalAdapter implements PaymentProcessor {

    private Paypal paypal;

    public PaypalAdapter(Paypal payPal) {
        this.paypal = payPal;
    }

    @Override
    public void pay(String account, double amount) {
        paypal.makePayment(account, amount);
    }
}
