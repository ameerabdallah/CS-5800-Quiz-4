package com.ameerdev.adaptors;

import com.ameerdev.gateways.PaypalGateway;
import com.ameerdev.PaymentProvider;

public class PaypalAdaptor implements PaymentProvider {
    private final PaypalGateway paypalGateway = new PaypalGateway();

    private final String email;

    public PaypalAdaptor(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        com.ameerdev.gateways.PaypalGateway paypalGateway = new com.ameerdev.gateways.PaypalGateway();
        paypalGateway.makePayment(amount, this.email);
    }
}
