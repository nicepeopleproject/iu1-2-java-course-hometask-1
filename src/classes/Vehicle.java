package classes;

public class Vehicle {
    private String name;
    private Type type;
    private float fuel;
    private float averagespeed;

    public enum Type{
        Car, Truck, Bycycle;
    }

    public Vehicle(String name, Type type, float fuel, float averagespeed) {
        this.name = name;
        this.type = type;
        this.fuel = fuel;
        this.averagespeed = averagespeed;
    }

    public float time(float distance) {
        return distance / averagespeed;
    }

    public float distance_fuel(float distance) {
        return (fuel / 100) * distance;
    }
    public static void VehicleInfo(Vehicle vehicle) {
        System.out.println("Name = " + vehicle.name);
        System.out.println("Type = " + vehicle.type);
        System.out.println("Fuel consumption = " + vehicle.fuel);
        System.out.println("Average speed = " + vehicle.averagespeed);
    }
}


