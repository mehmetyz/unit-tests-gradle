package models.common;

public abstract class Vehicle {
    protected String name;
    protected String model;
    protected VehicleType vehicleType;
    protected int year = 0;
    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setYear(int year) {
        if(year <= 0) return;
        this.year = year;
    }

    public abstract String getTextOfVehicle();
}
