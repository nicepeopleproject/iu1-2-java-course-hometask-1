package classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Vehicle auto = new Vehicle();
        System.out.println("Введите тип транспортного средства, его среднюю скорость (км/ч) и расход (л) на 100 км: ");
        auto.type = input.next();
        auto.av_speed = input.nextDouble();
        auto.consum_100 = input.nextDouble();
        System.out.println("Введите дистанцию (км), которую планируется преодолеть: ");
        double S = input.nextDouble();
        auto.time(S, auto.av_speed);
        auto.fuel(S, auto.consum_100);
    }
}
