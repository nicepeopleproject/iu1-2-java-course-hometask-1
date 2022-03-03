package classes;

public class VehicleTest {
    public static void main(String[] a){
        Vehicle superCar = new Vehicle("Corvette", Vehicle.Type.Cabriolet, 120, 12);

        System.out.println(superCar.calculateTime(213));
        System.out.println(superCar.calculateFuel(213));
    }
}
