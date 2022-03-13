package classes;

public class test {
    public static void main(String[] args) {
        Vehicle transport_1 = new Vehicle("BMW", 130, 13);
        Vehicle transport_2 = new Vehicle("Mercedes", 145, 11);
        Vehicle transport_3 = new Vehicle("Audi", 150, 15);

        transportInfo(transport_1);
        transportInfo(transport_2);
        transportInfo(transport_3);
    }

    public static void transportInfo(Vehicle transport) {
        System.out.println("Time = " + transport.distanceTime(2000));
        System.out.println("Fuel = " + transport.fuelCalculation(2000));

        System.out.println("Type of vehicle: " + transport.getType());
        System.out.println("Average speed of vehicle: " + transport.getAvgSpeed());
        System.out.println("Consumption per 100 Km: " + transport.getFuelConsumption());
    }
}