package classes;

public class Vehicle {
    private String type;
    private int average_speed;
    private int consumption_100km;

    public Vehicle(String type, int average_speed, int consumption_100km) {
        this.type = type;
        this.average_speed = average_speed;
        this.consumption_100km = consumption_100km;
    }

    public String getType() {
        return type;
    }

    public int getMiddleSpeed() {
        return average_speed;
    }

    public int getConsumptionPer100km() {
        return consumption_100km;
    }

    public double getTime(double distance) {
        return distance/average_speed;
    }

    public double getFuel(double distance) {
        return distance*consumption_100km/100;
    }



}
