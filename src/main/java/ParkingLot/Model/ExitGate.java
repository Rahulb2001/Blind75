package ParkingLot.Model;

import ParkingLot.Services.PaymentCalculation;
import java.time.LocalDateTime;

public class ExitGate {

    private ParkingFloor parkingFloor;

    public ExitGate(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public boolean processExit(Ticket ticket, Payment payment) {

        double amount = PaymentCalculation.calculatePayment(ticket);

        boolean isSuccessfulPayment = payment.doPayment(true, amount);

        if (isSuccessfulPayment) {
            ParkingSpot parkingSpot = ticket.getParkingSpot();
            parkingSpot.removeVehicle();
            ticket.setPaid(true);
            System.out.println("Vehicle " + ticket.getVehicle().getVehicleNumber() + " exited successfully.");
            return true;
        }

        System.out.println("Payment failed. Vehicle cannot exit.");
        return false;
    }
}