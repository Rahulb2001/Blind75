package Adapter;

public class LegacyAdapter implements PaymentProcessor{

    LegacyGateway legacyGateway;
    long referenceId;

    public LegacyAdapter(LegacyGateway legacyGateway) {
        this.legacyGateway = legacyGateway;
    }

    @Override
    public void processPayment(double amount) {

        legacyGateway.executeTransaction(amount,"USD");
        referenceId= legacyGateway.getReferenceNumber();

    }

    @Override
    public boolean isPaymentSuccessful() {
        return legacyGateway.checkStatus(referenceId);
    }

    @Override
    public String getTransactionId() {
        return String.valueOf(referenceId);
    }
}
