package classes;

public class Venicle {
    private static double averageSpeed;
    private static double fuelСonsumption;
    private Type type;

    private static double time;
    private static double fuel;

    public Venicle(int averageSpeed, int fuelСonsumption, Type type) {
        this.averageSpeed = averageSpeed;
        this.fuelСonsumption = fuelСonsumption;
        this.type = type;
    }

    public static double timeToArrive(int distance){
        time = distance/averageSpeed;
        return Math.round(time * 100.0)/100.0;
    }

    public static double needFuel(int distance){
        fuel = (fuelСonsumption/100)*distance;
        return Math.round(fuel * 100.0) / 100.0;
    }
}
