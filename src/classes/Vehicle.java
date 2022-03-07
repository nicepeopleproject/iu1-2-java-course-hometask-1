package classes;

public class Vehicle {
    private String type;
    private double averageSpeed;
    private double consumptionPer100Km;

    public Vehicle(String type, double averageSpeed, double consumptionPer100Km) {
        this.type = type;
        this.averageSpeed = averageSpeed;
        this.consumptionPer100Km = consumptionPer100Km;
    }

    public String getType() { return type; }
    public double getAverageSpeed() { return averageSpeed; }
    public double getConsumptionPer100Km() { return consumptionPer100Km;}

    public double timeOfDistance(double distance) { return distance / averageSpeed; }
    public double requiredAmountOfFuel(double distance) { return distance * 100 / consumptionPer100Km; }

}

