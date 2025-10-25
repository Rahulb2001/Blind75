package Adapter;

public class ECommerceAppV2 {

    public static void main(String[] args) {
        System.out.println("E-Commerce Application V2");
        LegacyGateway legacyGateway = new LegacyGateway();
        LegacyAdapter legacyAdapter = new LegacyAdapter(legacyGateway);
        legacyAdapter.processPayment(10001);
        legacyAdapter.getTransactionId();
    }
}
