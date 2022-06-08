package classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Vehicle auto = new Vehicle();
        int b;
        System.out.println("Введите тип транспортного средства, его среднюю скорость (км/ч) и расход (л) на 100 км: ");
        auto.type = input.nextLine();
        auto.av_speed = input.nextDouble();
        auto.consum_100 = input.nextDouble();
        System.out.println("Введите дистанцию (км), которую планируется преодолеть: ");
        double S = input.nextDouble();
        while (auto.type.trim().equals("") || auto.av_speed <= 0 || auto.consum_100 < 0 || S < 0 || auto.isDigit(auto.type)) {
            System.out.println();
            System.out.println("Введены неверные данные ");
            System.out.println();
            System.out.println("Введите тип транспортного средства, его среднюю скорость (км/ч) и расход (л) на 100 км: ");
            auto.type = input.next();
            auto.av_speed = input.nextDouble();
            auto.consum_100 = input.nextDouble();
            System.out.println("Введите дистанцию (км), которую планируется преодолеть: ");
            S = input.nextDouble();
        }

        auto.time(S);
        auto.fuel(S);
    }
}
