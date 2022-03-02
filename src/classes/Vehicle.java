package classes;

public class Vehicle {

    public Vehicle(String name, float fuel_consumption, float velocity) {
        this.name = name;
        this.fuel_consumption = fuel_consumption;
        this.velocity = velocity;
    }

    public float time(Vehicle vehicle, float distance) {
        return distance/vehicle.velocity;
    }

    public int distance_fuel(Vehicle vehicle, float distance) {
        return (vehicle.fuel_consumption/100)*distance;
    }


}
