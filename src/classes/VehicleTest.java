package classes;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("1", 10, 50);
        Vehicle vehicle2 = new Vehicle("2", 20, 100);

        VehicleInfo(vehicle1);
        VehicleInfo(vehicle2);
    }

    public static void VehicleInfo(Vehicle vehicle){
        System.out.println("Name = " + vehicle.Name);
        System.out.println("Fuel consumption = " + vehicle.fuel_consumption);
        System.out.println("Velocity = " + vehicle.velocity);
    }