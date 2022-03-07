package classes;
import java.util.Scanner;

public class Vehicle {
    String type;
    double averageSpeed;
    double consumptionPer100Km;

    public static void timeOfDistance(double distance, double averageSpeed) {
        System.out.println(distance / averageSpeed);
    }

    public static void requiredAmountOfFuel(double distance, double consumptionPer100Km) {
        System.out.println(distance / consumptionPer100Km * 100);
    }
}

