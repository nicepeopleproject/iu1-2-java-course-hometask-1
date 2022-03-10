package classes;

public class Vehicle {
    private String type;
    private int average_speed;
    private int compution_per_100km;
    public Vehicle(String type, int average_speed, int compution_per_100km){
        this.type = type;
        this.average_speed = average_speed;
        this.compution_per_100km = compution_per_100km;
    }
    public String getType(){
        return type;
    }
    public int getAverage_speed(){
        return average_speed;
    }
    public int getCompution_per_100km(){
        return compution_per_100km;
    }
    public double calculateTime(double distance){
        if(average_speed != 0) {
            return distance / average_speed;
        }
        else{
            return 0;
        }
    }
    public double calculateFuelCompustion(double distance){
        return distance / 100 * compution_per_100km;
    }
}
