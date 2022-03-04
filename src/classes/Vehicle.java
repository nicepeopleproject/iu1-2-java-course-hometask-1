package classes;

public class Vehicle {
    public String name;
    public Type type;
    public float fuel;
    public float averagespeed;

    public enum Type{
        Car, Truck, Bycycle;
    }

    public Vehicle(String name, Type type, float fuel, float averagespeed) {
        this.name = name;
        this.type = type;
        this.fuel = fuel;
        this.averagespeed = averagespeed;
    }

    public float time(Vehicle vehicle, float distance) {
        return distance / vehicle.averagespeed;
    }

    public float distance_fuel(Vehicle vehicle, float distance) {
        return (vehicle.fuel / 100) * distance;
    }
}


