package ParkingLot.Model;

import ParkingLot.Enums.PaymentMethod;

public class Payment {

    private String paymentId;
    private String VehicleNumber;
    private PaymentMethod paymentMethod;
    private double amount;
    private boolean isSuccessful;

    public Payment(String paymentId, String vehicleNumber, PaymentMethod paymentMethod, double amount) {
        this.paymentId = paymentId;
        VehicleNumber = vehicleNumber;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        VehicleNumber = vehicleNumber;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean doPayment(boolean isSuccessful,double payement){
        if(payement==0.0){
            return false;
        }else{
            this.isSuccessful = isSuccessful;
            return this.isSuccessful;
        }
    }

}
