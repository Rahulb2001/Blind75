package ParkingLot.Services;

import ParkingLot.Model.Ticket;
import java.time.Duration;
import java.time.LocalDateTime;

public class PaymentCalculation {

    public static double calculatePayment(Ticket ticket) {
        Duration duration = Duration.between(ticket.getEntryTime(), LocalDateTime.now());
        long hours = duration.toHours();

        String vehicleType = ticket.getVehicle().getVehicleType().toString();

        if (vehicleType.equals("CAR")) {
            return hours * 100.0;
        } else if (vehicleType.equals("BIKE")) {
            return hours * 50.0;
        } else if (vehicleType.equals("TRUCK")) {
            return hours * 150.0;
        }
        return 0.0;
    }
}