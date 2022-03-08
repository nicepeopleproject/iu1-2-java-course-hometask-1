package classes;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle transport_1 = new Vehicle("Mercedes", 140, 10);
        Vehicle transport_2 = new Vehicle("BMW", 120, 12);
        Vehicle transport_3 = new Vehicle("Ferrari", 160, 16);

        transportInfo(transport_1);
        transportInfo(transport_2);
        transportInfo(transport_3);
    }

    public static void transportInfo(Vehicle transport) {
        System.out.println("Time = " + transport.timeOfDistance(2000));
        System.out.println("Fuel = " + transport.requiredAmountOfFuel(2000));

        System.out.println("Type of vehicle: " + transport.getType());
        System.out.println("Average speed of vehicle: " + transport.getAverageSpeed());
        System.out.println("Consumption per 100 Km: " + transport.getConsumptionPer100Km());
    }
}
