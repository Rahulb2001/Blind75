package ParkingLot.Model;

import ParkingLot.Strategy.SpotAssignmentStrategy;
import java.time.LocalDateTime;
import java.util.List;

public class EntryGate {

    private String gateId;
    private SpotAssignmentStrategy spotAssignmentStrategy;

    public EntryGate(String gateId, SpotAssignmentStrategy spotAssignmentStrategy) {
        this.gateId = gateId;
        this.spotAssignmentStrategy = spotAssignmentStrategy;
    }

    public Ticket allowEntry(Vehicle vehicle, List<ParkingFloor> parkingFloors) {
        ParkingSpot assignedSpot = spotAssignmentStrategy.spot(vehicle, parkingFloors);

        if (assignedSpot != null) {

            assignedSpot.parkVehicle(vehicle);

            Ticket ticket = new Ticket(
                    "TICKET_" + System.currentTimeMillis(),
                    vehicle,
                    LocalDateTime.now(),
                    assignedSpot
            );

            System.out.println("Entry allowed for vehicle: " + vehicle.getVehicleNumber() + " at gate: " + gateId);
            System.out.println("Assigned spot: " + assignedSpot.getSpotId());
            return ticket;
        } else {
            System.out.println("No available spots for vehicle: " + vehicle.getVehicleNumber());
            return null;
        }
    }
}