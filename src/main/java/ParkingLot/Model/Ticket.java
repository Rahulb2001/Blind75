package ParkingLot.Model;

import java.time.LocalDateTime;

public class Ticket {

    private String ticketId;
    private Vehicle vehicle;
    private LocalDateTime entryTime;
    private ParkingSpot parkingSpot;
    private boolean isPaid;

    public Ticket(String ticketId, Vehicle vehicle, LocalDateTime entryTime, ParkingSpot parkingSpot) {
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.entryTime = entryTime;
        this.parkingSpot = parkingSpot;
        this.isPaid = false;
    }

    public String getTicketId() {
        return ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }
}