package classes;

public class Vehicle {
    private String transportName;
    private int avarageSpeed;
    private int fuelConsumption;

    public Vehicle(String transportName, int avarageSpeed, int fuelConsumption) {
        if ((speedMoreThanZero(avarageSpeed)) && (fuelConsumptionMoreThanZero(fuelConsumption))) {
            this.transportName   = transportName;
            this.avarageSpeed    = avarageSpeed;
            this.fuelConsumption = fuelConsumption;
        } else {
            System.out.println("enter correct values"); //
        }
    }

    public String getTransportName() { return  transportName; }
    public int getAvarageSpeed() { return avarageSpeed; }
    public int getFuelConsumption() { return fuelConsumption; };

    private boolean speedMoreThanZero(int avarageSpeed) { return avarageSpeed > 0; }
    private boolean fuelConsumptionMoreThanZero(int fuelConsumption) { return fuelConsumption > 0; }
}
