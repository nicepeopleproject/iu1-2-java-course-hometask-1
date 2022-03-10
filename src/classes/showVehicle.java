package classes;
import java.util.Scanner;

public class showVehicle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String type;
        int average_speed;
        int compustion_per_100km;
        double distance;

        System.out.println("Input vehicle type: ");
        type = in.next();
        System.out.println("Input vehicle average speed: ");
        average_speed = in.nextInt();
        System.out.println("Input vehicle compustion per 100km: ");
        compustion_per_100km = in.nextInt();

        Vehicle car = new Vehicle(type, average_speed, compustion_per_100km);
        printVehicle(car);

        System.out.println("Input distance for time calculation:");
        distance = in.nextDouble();
        System.out.println("Time in hours: " + car.calculateTime(distance));

        System.out.println("Input distance for compustion calculation:");
        distance = in.nextDouble();
        System.out.println("Fuel in liters: " + car.calculateFuelCompustion(distance));
    }

    public static void printVehicle(Vehicle vehicle){
        System.out.println("Type: " + vehicle.getType());
        System.out.println("Average Speed (km/h): " + vehicle.getAverage_speed());
        System.out.println("Compustion (liters/100km): " + vehicle.getCompution_per_100km());
    }
}
