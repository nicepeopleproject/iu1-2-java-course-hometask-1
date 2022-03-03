package classes;

public class Vehicle {
    private String name;
    private double fuelConsumption;
    private double velocity;
    private Type type;

    public enum Type{
        Coupe, Estate, Cabriolet, Sedan, Limousine, OffRoad, Truck
    }

    private boolean checkParameters(double velocity, double fuelConsumption){
        return velocity > 0 && fuelConsumption > 0;
    }

    public Vehicle(String name, Type type, double velocity, double fuelConsumption){
        if(!checkParameters(velocity, fuelConsumption)) throw new RuntimeException("Parameters should be positive!");
        this.name = name;
        this.type = type;
        this.velocity = velocity;
        this.fuelConsumption = fuelConsumption;
    }


    public double calculateTime(double distance){
        if(distance < 0) throw  new RuntimeException("negative distance!");
        return distance/velocity;
    }

    public double calculateFuel(double distance){
        if(distance < 0) throw  new RuntimeException("negative distance!");
        return distance*(fuelConsumption/100);
    }

}
