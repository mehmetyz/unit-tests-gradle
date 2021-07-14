import models.vehicle.Airplane;
import models.vehicle.Car;
import models.vehicle.Ship;
import models.vehicle.Truck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GradleAppTest {

    GradleApp app;

    @BeforeEach
    private void init(){
        app = new GradleApp();
    }

    @Test
    public void testAddingCar(){
        app.addCar("BMW","M5",2020);
        assertTrue(app.hasVehicle());
        var car = app.getVehicle("BMW","M5",2020);
        assertNotNull(car);
        assertEquals("Car, BMW M5 - 2020 year model", car.getTextOfVehicle());
    }

    @Test
    public void testAddingAirplane(){
        app.addAirplane("Boeing", "747", 2017,"United States");
        assertTrue(app.hasVehicle());
        var airplane = app.getVehicle("Boeing","747",2017);
        assertNotNull(airplane);
        assertEquals("Airplane, Boeing - 747, United States (2017 year model)",airplane.getTextOfVehicle());
    }

    @Test
    public void testAddingShip(){
        app.addShip("USS Gladiator", "MCM-11", 2011,"United States");
        assertTrue(app.hasVehicle());
        var ship = app.getVehicle("USS Gladiator","MCM-11",2011);
        assertNotNull(ship);
        assertEquals("Ship, USS Gladiator - MCM-11, United States (2011 year model)",ship.getTextOfVehicle());
    }

    @Test
    public void testAddingTruck(){
        app.addTruck("Scania","R800",2018);
        assertTrue(app.hasVehicle());

        var truck = app.getVehicle("Scania","R800",2018);
        assertNotNull(truck);
        assertEquals("Truck, Scania R800 - 2018 year model",truck.getTextOfVehicle());
    }

    @Test
    public void testRemovingVehicle(){
        app.addCar("BMW","M5",2020);
        assertTrue(app.hasVehicle());
        assertNotNull(app.getVehicle("BMW","M5",2020));

        app.removeVehicle("BMW","M5",2020);
        assertFalse(app.hasVehicle());
        assertNull(app.getVehicle("BMW","M5",2020));
    }

    @Test
    public void testGetVehicle(){
        app.addCar("BMW","M5",2020);
        app.addAirplane("Boeing","747",2017,"United States");
        app.addShip("USS Gladiator", "MCM-11",2011,"United States");
        app.addTruck("Scania","R800",2018);

        assertTrue(app.hasVehicle());
        var car = app.getVehicle("BMW","M5",2020);
        var airplane = app.getVehicle("Boeing","747",2017);
        var ship = app.getVehicle("USS Gladiator", "MCM-11",2011);
        var truck  = app.getVehicle("Scania","R800",2018);

        assertNotNull(car);
        assertNotNull(airplane);
        assertNotNull(ship);
        assertNotNull(truck);

        assertTrue(car instanceof Car);
        assertTrue(airplane instanceof Airplane);
        assertTrue(ship instanceof Ship);
        assertTrue(truck instanceof Truck);

    }
}