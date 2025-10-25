package Adapter;

public class EcommerceV1 {

    public static void main(String[] args) {
        System.out.println("Ecommerce V1");
        PaymentProcessor paymentProcessor=new InHouseImplmentation();

        CheckoutService checkoutService=new CheckoutService(paymentProcessor);
        System.out.println(checkoutService.isChekoutSuccs(10000));
    }
}
