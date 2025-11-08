package com.ameerdev.gateways;

public class SquareGateway {
    public SquareGateway() {
    }

    public void processTransaction(double amount, String locationID) {
        System.out.printf("Square payment of $%.2f processed for location ID: '%s'\n", amount, locationID);
    }
}
