package classes;

public class Vehicle {
    public String type;
    public double av_speed;
    public double consum_100;

    public void time(double S){
        double time = S/av_speed;
        String result = String.format("%.2f", time);
        System.out.println("Время, за которое " + type + " преодолеет дистанцию = " + result + "ч");
    }

    public void fuel(double S) {
        double fuel = (S/100)*consum_100;
        String result = String.format("%.2f", fuel);
        System.out.println("На " + S + "км потребуется " + result + "л топлива ");
    }

    public boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
