package classes;

import java.util.Scanner;

public class Vehicle {
    String name;
    Float aver_speed;
    Float fuel_con;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Vehicle myCar = newCar();
        System.out.print("Введите дистанцию ");
        float distance = sc.nextFloat();
        while (distance != 0.0){
            Time(myCar, distance);
            FuelNeed(myCar, distance);
            System.out.println("");
            System.out.print("Введите дистанцию ");
            distance = sc.nextFloat();
        }
    }

    static Vehicle newCar(){
        Scanner sc= new Scanner(System.in);
        Vehicle Car = new Vehicle();
        System.out.println("Введите название новой машины");
        Car.name = sc.nextLine();
        System.out.println("Введите среднюю скорость новой машины");
        Car.aver_speed = sc.nextFloat();
        System.out.println("Введите среднюю скорость новой машины");
        Car.fuel_con = sc.nextFloat();
        System.out.println("Ваша машина: "+Car.name + " " + Car.aver_speed + " " + Car.fuel_con);
        return Car;
    }

    static void Time(Vehicle car, float d){
        float time = d/car.aver_speed;
        System.out.println("Время прохождения = "+time);
    }

    static void FuelNeed(Vehicle car, float d){
        float fuel = car.fuel_con*d/100;
        System.out.println("Необходимое кол-во баков = "+fuel);
    }

}
