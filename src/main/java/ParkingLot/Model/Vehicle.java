package ParkingLot.Model;

import ParkingLot.Enums.VehicleSpot;
import ParkingLot.Enums.VehicleType;

public class Vehicle {

    private String VehicleNumber;
    private VehicleType VehicleType ;
    private VehicleSpot ParkingSpot;

    public Vehicle(String vehicleNumber, VehicleType vehicleType, VehicleSpot parkingSpot) {
        VehicleNumber = vehicleNumber;
        VehicleType = vehicleType;
        ParkingSpot = parkingSpot;
    }

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        VehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        VehicleType = vehicleType;
    }

    public VehicleSpot getParkingSpot() {
        return ParkingSpot;
    }

    public void setParkingSpot(VehicleSpot parkingSpot) {
        ParkingSpot = parkingSpot;
    }
}
