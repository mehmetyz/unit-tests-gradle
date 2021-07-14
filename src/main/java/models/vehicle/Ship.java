package models.vehicle;

import models.common.*;

public class Ship extends Vehicle {

    private String country;


    public Ship(String name, String model, int year, String country){

        this.name = name;
        this.model = model;
        this.year = year;
        this.country = country;
        this.vehicleType = VehicleType.SHIP;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String getTextOfVehicle() {
        return String.format("Ship, %s - %s, %s (%d year model)",this.name,this.model,this.country, this.year);
    }
}
