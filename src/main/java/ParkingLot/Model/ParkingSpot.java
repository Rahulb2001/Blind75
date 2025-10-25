package ParkingLot.Model;

public class ParkingSpot {

    private String spotId;
    private boolean isOccupied;
    private Vehicle vehicle;

    public ParkingSpot(String spotId) {
        this.spotId = spotId;
        this.isOccupied = false;
        this.vehicle = null;
    }

    public String getSpotId() {
        return spotId;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isOccupied = true;
    }

    public void removeVehicle() {
        this.vehicle = null;
        this.isOccupied = false;
    }

    public void setSpotId(String spotId) {
        this.spotId = spotId;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
