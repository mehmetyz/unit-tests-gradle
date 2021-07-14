package models.vehicle;

import models.common.*;

public class Car extends Vehicle{

    public Car(String name, String model, int year){

        this.name = name;
        this.model = model;
        this.year = year;
        this.vehicleType = VehicleType.CAR;
    }


    @Override
    public String getTextOfVehicle() {

        return String.format("Car, %s %s - %d year model",
                                this.name,
                                this.model,
                                this.year);
    }
}