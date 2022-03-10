package classes;
import java.util.Scanner;

public class Vehicle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Transport audi = new Transport();
        System.out.println("Введите тип транспортного средства");
        audi.type = in.nextLine();
        System.out.println("Введите среднюю скорость");
        audi.average_speed = in.nextInt();
        System.out.println("Введите расход топлива");
        audi.fuel_consumption = in.nextInt();

        System.out.println("Введите дистанцию");
        int d = in.nextInt();
        audi.calculate_time(d);
        audi.calculate_fuel_consumption(d);
    }
}

class Transport {
    String type;
    int average_speed;
    int fuel_consumption;

    void calculate_time(int d) {
        System.out.println("Время, за которое была пройдена дистанция   " + d/average_speed);
    }

    void calculate_fuel_consumption(int d) {
        System.out.println("Количесто топлива, необходимого для прохождения дистанции   " + d*fuel_consumption/100);
    }
}

