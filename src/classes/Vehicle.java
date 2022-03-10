package classes;

public class Vehicle {
    public String type;
    public double av_speed;
    public double consum_100;

    public void time(double S, double av_speed){
        double time = S/av_speed;
        String result = String.format("%.2f", time);
        System.out.println("Время, за которое транспортное средство преодолеет дистанцию = " + result + "ч");
    }

    public void fuel(double S, double consum_100) {
        double fuel = (S/100)*consum_100;
        String result = String.format("%.2f", fuel);
        System.out.println("На " + S + "км потребуется " + result + "л топлива ");
    }
}
