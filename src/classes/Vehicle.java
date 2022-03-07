package classes;

public class Vehicle {
    private String type;
    private int middleSpeed;
    private int consumptionPer100km;

    public Vehicle(String type, int middleSpeed, int consumptionPer100km) {
        this.type = type;
        this.middleSpeed = middleSpeed;
        this.consumptionPer100km = consumptionPer100km;
    }

    public String getType() {
        return type;
    }

    public int getMiddleSpeed() {
        return middleSpeed;
    }

    public int getConsumptionPer100km() {
        return consumptionPer100km;
    }

    public double timeCounter(double distance) {
        return distance/middleSpeed;
    }

    public double fuelCounter(double distance) {
        return (distance*consumptionPer100km)/100;
    }
}
