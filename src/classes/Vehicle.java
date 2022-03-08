package classes;

import java.util.Scanner;

public class Vehicle {
    public String tipeTransport;
    public int averageSpeed;
    public int fuelFlowRate;
    public void parametrs() {
        Scanner in = new Scanner(System.in);
        System.out.println("\nВведите тип ТС:");
        tipeTransport = in.nextLine();

        boolean isTrue = true;
        while (isTrue) {
            System.out.println("Введите среднюю скорость км/ч (от 1 до 200 км/ч): ");
            averageSpeed = in.nextInt();
            if (averageSpeed > 0 && averageSpeed < 200) {
                isTrue = false;
            }
            if(averageSpeed < 0 || averageSpeed > 200) {
                System.out.println("Вы велли не верное значение, смотрите условие!");
            }
        }

        boolean isFound = true;
        while (isFound) {
            System.out.println("Введите расход топлива на 100км (это примерно 8-12 для автомобиле1\n" +
                    "и где-то 30-50 для грузовиков):");
            fuelFlowRate = in.nextInt();
            if (fuelFlowRate > 0 && fuelFlowRate < 200) {
                isFound = false;
            }
            if (fuelFlowRate < 0 || fuelFlowRate > 200) {
                System.out.println("Вы велли не верное значение");
            }
        }


        System.out.println("\nВаши данные:");
        System.out.println(tipeTransport);
        System.out.println(averageSpeed);
        System.out.println(fuelFlowRate);
    }

}
