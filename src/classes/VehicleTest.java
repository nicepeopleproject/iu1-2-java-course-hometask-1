package classes;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("transport1", Vehicle.Type.Car, 15, 80);
        Vehicle truck = new Vehicle("transport2", Vehicle.Type.Truck, 35, 50);

        System.out.println(car.time(1000));
        System.out.println(truck.time(1000));
        System.out.println(car.distance_fuel(100));
        System.out.println(truck.distance_fuel(100));
        Vehicle.VehicleInfo(car);
        Vehicle.VehicleInfo(truck);
    }
}
