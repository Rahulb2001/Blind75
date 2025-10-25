package ParkingLot.Strategy;

import ParkingLot.Model.ParkingFloor;
import ParkingLot.Model.ParkingSpot;
import ParkingLot.Model.Vehicle;

import java.util.List;

public interface SpotAssignmentStrategy {

    ParkingSpot spot(Vehicle vehicle, List<ParkingFloor> parkingFloors);

}
