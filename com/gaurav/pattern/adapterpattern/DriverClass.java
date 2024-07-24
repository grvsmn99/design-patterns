package com.gaurav.pattern.adapterpattern;

import com.gaurav.pattern.adapterpattern.adapterClasses.PaypalAdapter;
import com.gaurav.pattern.adapterpattern.adapterClasses.StripeAdapter;
import com.gaurav.pattern.adapterpattern.existingClasses.Paypal;
import com.gaurav.pattern.adapterpattern.existingClasses.Stripe;
import com.gaurav.pattern.adapterpattern.expectedInterfacebyclient.PaymentProcessor;

public class DriverClass {
    public static void main(String[] args) {
        Paypal paypal = new Paypal();
        PaymentProcessor paypalPaymentProcessor = new PaypalAdapter(paypal);
        paypalPaymentProcessor.pay("gaurav@email.com", 10.0);


        Stripe stripe = new Stripe();
        PaymentProcessor stripePaymentProcessor = new StripeAdapter(stripe);
        stripePaymentProcessor.pay("343453654646", 200.15);
    }
}
