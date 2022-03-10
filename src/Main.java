import classes.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle newAuto = new Vehicle("car", 150, 100);

        double fuel = newAuto.getAverageTripTime(390);
    }
}
