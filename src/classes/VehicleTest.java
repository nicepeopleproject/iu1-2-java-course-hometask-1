package classes;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("transport1", Vehicle.Type.Car, 15, 80);
        Vehicle truck = new Vehicle("transport2", Vehicle.Type.Truck, 35, 50);

        VehicleInfo(car);
        VehicleInfo(truck);
    }

    public static void VehicleInfo(Vehicle vehicle) {
        System.out.println("Name = " + vehicle.name);
        System.out.println("Type = " + vehicle.type);
        System.out.println("Fuel consumption = " + vehicle.fuel);
        System.out.println("Average speed = " + vehicle.averagespeed);
    }
}
