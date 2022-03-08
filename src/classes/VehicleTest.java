package classes;

import java.util.Scanner;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle firstTransport = new Vehicle();
        Vehicle secondTransport = new Vehicle();
        Vehicle thirdTransport = new Vehicle();

        System.out.println("\nВведите тип транспортного средства, его среднюю скорость,\n" +
                "расход бензина на 100км, для 3 транспортных средств");
        firstTransport.parametrs();
        secondTransport.parametrs();
        thirdTransport.parametrs();

        Scanner in = new Scanner(System.in);
        System.out.println("Введите какое расстояние вы хотите преодолеть");
        int distance = in.nextInt();
        int needFuel;
        float spendTime;
        boolean isFound = false;
        while (!isFound) {
            System.out.println("\nВыберите пункт для определения сколько бензина надо и времени \n" +
                    "1-для первого транспортного средства\n" +
                    "2-для второго транспортного средства\n" +
                    "3-для третьего транспортного средства\n");
            int count = in.nextInt();
            if(count > 0) {
                switch (count) {
                    case 1:
                        needFuel = distance / 100 * firstTransport.fuelFlowRate;
                        System.out.println("Сколкьо бензина понадобится");
                        System.out.println(needFuel);

                        spendTime = distance / firstTransport.averageSpeed;
                        System.out.println("Понадобится времени на преодаление расстояния (в часах)");
                        System.out.println(spendTime);
                        break;
                    case 2:
                        needFuel = distance / 100 * secondTransport.fuelFlowRate;
                        System.out.println("Сколкьо бензина понадобится");
                        System.out.println(needFuel);

                        spendTime = distance / secondTransport.averageSpeed;
                        System.out.println("Понадобится времени на преодаление расстояния (в часах)");
                        System.out.println(spendTime);
                        break;
                    case 3:
                        needFuel = distance / 100 * thirdTransport.fuelFlowRate;
                        System.out.println("Сколкьо бензина понадобится");
                        System.out.println(needFuel);

                        spendTime = distance / thirdTransport.averageSpeed;
                        System.out.println("Понадобится времени на преодаление расстояния (в часах)");
                        System.out.println(spendTime);
                        break;
                }
            }
            if(count <= 0) {
                isFound = true;
            }
        }
    }
}
