package com.ameerdev.gateways;

public class StripeGateway {
    public StripeGateway() {
    }

    // I am giving these different method names to simulate different APIs
    public void executePayment(double paymentAmount, String cardHolderName, String cardNumber, String expirationDate) {
        System.out.printf("Payment of $%.2f going from '%s'. Card number: '%s', EXP: '%s'\n", paymentAmount, cardHolderName, cardNumber, expirationDate);
    }
}
