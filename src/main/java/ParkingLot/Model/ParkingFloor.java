package ParkingLot.Model;

import java.util.List;

public class ParkingFloor {

    private List<ParkingSpot> parkingSpots;
    private String floorId;

    public ParkingFloor(List<ParkingSpot> parkingSpots, String floorId) {
        this.parkingSpots = parkingSpots;
        this.floorId = floorId;
    }
    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public String getFloorId() {
        return floorId;
    }

    public List<ParkingSpot> getAvailableSpots() {

        List<ParkingSpot> availableSpots = new java.util.ArrayList<>();
        for (ParkingSpot spot : parkingSpots) {
            if (!spot.isOccupied()) {
                availableSpots.add(spot);
            }
        }
        return  availableSpots;

    }
}
