package classes;

public class Vehicle {
    private String type;
    private double avgSpeed;
    private double fuelConsumption;

    public Vehicle(String type, double avgSpeed, double fuelConsumption) {
        this.type = type;
        this.avgSpeed = avgSpeed;
        this.fuelConsumption = fuelConsumption;
    }

    public String getType() {
        return type;
    }

    public double getAvgSpeed() {
        return avgSpeed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double distanceTime(double distance) {
        return distance / avgSpeed;
    }

    public double fuelCalculation(double distance) {
        return 100 / fuelConsumption * distance;
    }
}

