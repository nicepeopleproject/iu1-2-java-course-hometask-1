package classes;
import java.util.Scanner;

public class Vehicle {
    String name;
    int av_speed;
    int con;
    public static void main(String[] args) {
        Vehicle Audi = car_factory();
        d_time(Audi);
        f_count(Audi);
    }

    static void d_time(Vehicle Audi){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance for time");
        int distance = sc.nextInt();
        System.out.println("Amount of time: "+distance / Audi.av_speed);
    }

    static void f_count(Vehicle Audi){
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter distance for fuel");
        int distance = cs.nextInt();
        System.out.println("Amount of fuel: "+distance * Audi.con / 100);
    }

    static Vehicle car_factory(){
        Vehicle car = new Vehicle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Vehicle name");
        car.name = sc.nextLine();
        System.out.println("Enter Vehicle average speed");
        car.av_speed = sc.nextInt();
        System.out.println("Enter Vehicle consumption");
        car.con = sc.nextInt();
        //System.out.println(car.name+car.av_speed+car.con);
        return car;
    }
}
