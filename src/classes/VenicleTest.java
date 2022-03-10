package classes;

public class VenicleTest {
    private static int distance = 50;

    public static void main(String[] args) {
        Venicle venicle = new Venicle(30,9, Type.car);

        VenicleTest(venicle);
    }

    public static void VenicleTest(Venicle venicle){
        System.out.println("Time to arrive is " + Venicle.timeToArrive(distance) + " hours");
        System.out.println("Fuel needed to arrive is " + Venicle.needFuel(distance) + " liters");
    }
}
