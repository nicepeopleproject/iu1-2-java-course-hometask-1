package com.example.dz_1;
import java.util.Scanner;

public class Vehicle_demo {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Fennec", 80, 12);

        VehicleInfo(vehicle);
    }

    public static void VehicleInfo(Vehicle vehicle){
        Scanner in = new Scanner(System.in);

        System.out.print("Input a distance1: ");
        int dist1 = in.nextInt();
        System.out.println("time = " + vehicle.getTime(dist1));

        System.out.print("Input a distance2: ");
        int dist2 = in.nextInt();
        System.out.println("fuel = " + vehicle.getFuel(dist2));

    }
}