package Adapter;

public class CheckoutService {

    PaymentProcessor paymentProcessor;

    public CheckoutService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public boolean isChekoutSuccs(double amount){
        paymentProcessor.processPayment(amount);
        System.out.println(paymentProcessor.getTransactionId());
        return paymentProcessor.isPaymentSuccessful();
    }
}
