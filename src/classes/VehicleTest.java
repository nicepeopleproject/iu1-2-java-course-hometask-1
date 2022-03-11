package classes;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle lada_test = new Vehicle("LADA", 50, 12);
        int distance = 712;

        System.out.println("the time it takes the vehicle to cover the distance: " + distanceTime(lada_test.getAvarageSpeed(), distance));
        System.out.println("fuel consumption will be: " + fuelValuePerDistance(lada_test.getFuelConsumption(), distance));
    }

    public static int distanceTime(int avarageSpeed, int distance)  { return (distance / avarageSpeed); }
    public static int fuelValuePerDistance(int fuelConsumption, int distance) { return fuelConsumption * distance / 100; }
}
