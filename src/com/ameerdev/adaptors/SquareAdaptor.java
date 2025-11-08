package com.ameerdev.adaptors;

import com.ameerdev.PaymentProvider;
import com.ameerdev.gateways.SquareGateway;

public class SquareAdaptor implements PaymentProvider {
    private final SquareGateway squareGateway = new SquareGateway();
    private final String locationID;

    public SquareAdaptor(String locationID) {
        this.locationID = locationID;
    }

    @Override
    public void processPayment(double paymentAmount) {
        squareGateway.processTransaction(paymentAmount, this.locationID);
    }
}
