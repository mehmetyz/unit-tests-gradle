package models.vehicle;
import models.common.*;

public class Airplane extends Vehicle {

    private String country;
    public Airplane(String name, String model, int year, String manufactureCountry){
        this.name = name;
        this.model = model;
        this.year = year;
        this.country = manufactureCountry;
        this.vehicleType = VehicleType.AIRPLANE;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String getTextOfVehicle() {
        return String.format("Airplane, %s - %s, %s (%d year model)",
                                    this.name,
                                    this.model,
                                    this.country,
                                    this.year);
    }
}
