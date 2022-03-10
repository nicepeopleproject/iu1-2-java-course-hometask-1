package classes;
import java.util.Scanner;

public class Vehicle {

    string type;
    float avgSpeed;
    float fuelRate;

    float DistanceTime(float dist){
        return dist / avgSpeed;
    }

    float DistanceFuel(float dist){
        return dist / 100 * fuelRate;
    }
}

/*
public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Vehicle vehicle = new Vehicle();
        vehicle.type = in.nextLine();
        vehicle.avgSpeed = in.nextFloat();
        vehicle.fuelRate = in.nextFloat();
        float l = in.nextFloat();
        vehicle.DistanceTime(l);
        vehicle.DistanceFuel(l);
    }
} /*