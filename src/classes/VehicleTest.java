package classes;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle transport1 = new Vehicle("Mercedes", 140, 10);

        transportInfo(transport1);
    }

    public static void transportInfo (Vehicle transport1) {
        System.out.println("time = " + transport1.timeCounter(1500));
        System.out.println("fuel = " + transport1.fuelCounter(1500));

        System.out.println(transport1.getType());
        System.out.println(transport1.getMiddleSpeed());
        System.out.println(transport1.getConsumptionPer100km());
    }
}
