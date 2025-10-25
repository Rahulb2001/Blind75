package ParkingLot;

import ParkingLot.Enums.PaymentMethod;
import ParkingLot.Enums.VehicleSpot;
import ParkingLot.Enums.VehicleType;
import ParkingLot.Model.*;
import ParkingLot.Strategy.NearestSpotAssignmentStrategy;
import ParkingLot.Strategy.SpotAssignmentStrategy;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1. Setup the Parking Lot
        System.out.println("Setting up the parking lot...");

        // Create parking spots
        List<ParkingSpot> parkingSpots = new ArrayList<>();
        parkingSpots.add(new ParkingSpot("A1"));
        parkingSpots.add(new ParkingSpot("A2"));
        parkingSpots.add(new ParkingSpot("A3"));
        parkingSpots.add(new ParkingSpot("A4"));

        // Create a parking floor
        ParkingFloor parkingFloor1 = new ParkingFloor(parkingSpots, "Floor 1");

        // Add the floor to a list for the entry gate
        List<ParkingFloor> parkingFloors = new ArrayList<>();
        parkingFloors.add(parkingFloor1);

        // Create a spot assignment strategy
        SpotAssignmentStrategy assignmentStrategy = new NearestSpotAssignmentStrategy();

        // Create an entry gate
        EntryGate entryGate = new EntryGate("Gate 1", assignmentStrategy);

        // 2. A vehicle enters
        System.out.println("\nVehicle enters the parking lot.");
        Vehicle car = new Vehicle("DL 1A 1234", VehicleType.CAR, VehicleSpot.CAR);

        // The vehicle attempts to enter
        Ticket ticket = entryGate.allowEntry(car, parkingFloors);

        if (ticket != null) {
            System.out.println("Ticket created with ID: " + ticket.getTicketId());
            System.out.println("Vehicle " + ticket.getVehicle().getVehicleNumber() + " is parked at spot " + ticket.getParkingSpot().getSpotId());
        } else {
            System.out.println("Entry denied.");
            return;
        }

        // 3. Simulate time passing...
        System.out.println("\nSimulating 2 hours of parking...");
        // In a real application, the time would pass naturally. For this example, we'll just move on.

        // 4. A vehicle exits
        System.out.println("\nVehicle exits the parking lot.");

        // Create a payment object
        Payment payment = new Payment("PAYMENT_1", car.getVehicleNumber(), PaymentMethod.CREDIT_CARD, 0.0);

        // Create an exit gate
        ExitGate exitGate = new ExitGate(parkingFloor1);

        // The vehicle attempts to exit
        boolean exitSuccessful = exitGate.processExit(ticket, payment);

        if (exitSuccessful) {
            System.out.println("Exit successful. Payment completed.");
            System.out.println("Spot " + ticket.getParkingSpot().getSpotId() + " is now available.");
        } else {
            System.out.println("Exit failed. Payment issue.");
        }
    }
}