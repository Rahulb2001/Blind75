package ParkingLot.Strategy;

import ParkingLot.Model.ParkingFloor;
import ParkingLot.Model.ParkingSpot;
import ParkingLot.Model.Vehicle;

import java.util.List;

public class NearestSpotAssignmentStrategy implements SpotAssignmentStrategy{


    @Override
    public ParkingSpot spot(Vehicle vehicle, List<ParkingFloor> parkingFloors) {

        for(ParkingFloor floor: parkingFloors){
            List<ParkingSpot> spots=floor.getParkingSpots();
            for(ParkingSpot spot:spots){
                if(!spot.isOccupied()){
                    return spots.get(0);
                }
            }
        }
        return null;
    }


}
