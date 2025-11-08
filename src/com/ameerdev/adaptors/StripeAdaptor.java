package com.ameerdev.adaptors;

import com.ameerdev.PaymentProvider;
import com.ameerdev.gateways.StripeGateway;

public class StripeAdaptor implements PaymentProvider {

    private final StripeGateway stripeGateway = new StripeGateway();

    private final String cardHolderName;
    private final String cardNumber;
    private final String expirationDate;

    public StripeAdaptor(String cardHolderName, String cardNumber, String expirationDate) {
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }

    @Override
    public void processPayment(double paymentAmount) {
        StripeGateway stripeGateway = new StripeGateway();
        stripeGateway.executePayment(paymentAmount, this.cardHolderName, this.cardNumber, this.expirationDate);
    }
}
