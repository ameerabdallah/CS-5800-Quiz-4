package com.ameerdev.gateways;

public class PaypalGateway {
    public PaypalGateway() {
    }

    public void makePayment(double paymentAmount, String userEmail) {
        System.out.printf("Paypal payment of $%.2f processed for '%s'\n", paymentAmount, userEmail);
    }

}
