package models.vehicle;

import models.common.*;

public class Truck extends Vehicle {

    public Truck(String name, String model, int year){
        this.name = name;
        this.model = model;
        this.year = year;
        this.vehicleType = VehicleType.TRUCK;
    }


    @Override
    public String getTextOfVehicle() {
        return String.format("Truck, %s %s - %d year model", this.name, this.model, this.year);
    }
}
