package Adapter;

public class InHouseImplmentation implements PaymentProcessor{

    String transactionId;
    boolean paymentStatus;


    @Override
    public void processPayment(double amount) {
        paymentStatus=true;
        transactionId= "TXN_"+String.valueOf(System.currentTimeMillis());
    }

    @Override
    public boolean isPaymentSuccessful() {
        return paymentStatus;
    }

    @Override
    public String getTransactionId() {
        return transactionId;
    }
}
