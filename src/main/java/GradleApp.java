import models.common.Vehicle;
import models.vehicle.*;

import java.util.LinkedList;


public class GradleApp {

    public static void main(String[] args) {

      GradleApp app = new GradleApp();
    }

    private final LinkedList<Vehicle> vehicles;

    public GradleApp(){
        this.vehicles = new LinkedList<>();
    }

    private void add(Vehicle vehicle){
        if (vehicle == null) return;

        this.vehicles.add(vehicle);
    }
    public boolean hasVehicle()
    {
        return !this.vehicles.isEmpty();
    }

    public void addAirplane(String name, String model, int year, String country){
        add(new Airplane(name,model,year,country));
    }
    public void addCar(String name, String model, int year){
        add(new Car(name,model,year));
    }

    public void addShip(String name, String model, int year, String country){
        add(new Ship(name, model, year, country));
    }


    public void addTruck(String name, String model, int year){
        add(new Truck(name, model, year));
    }

    public Vehicle getVehicle(String name, String model, int year){

        for (Vehicle v : this.vehicles)
            if(v.getName().equals(name) && v.getModel().equals(model) && v.getYear() == year )
                return v;

        return null;
    }

    public void removeVehicle(String name, String model, int year){
        LinkedList<Vehicle> newVehicles = new LinkedList<>();

        for (Vehicle v : vehicles)
            if (!v.getName().equals(name) ||
                !v.getModel().equals(model) ||
                 v.getYear() != year)
                newVehicles.add(v);

        this.vehicles.clear();
        this.vehicles.addAll(newVehicles);
    }


}
