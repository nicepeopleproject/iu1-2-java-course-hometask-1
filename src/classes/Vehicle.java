package classes;


public class Vehicle {

    String vehicleType;

    public String getVehicleType() {
        if (vehicleType == null) {
            System.out.println("Variable is empty");
        }
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }


    public int averageSpeed;

    public int fuelConsumption;


    public Vehicle(String autoType){
        this.vehicleType = autoType;
    }

    public Vehicle(String autoType, int averageSpeed){
        this(autoType);
        this.averageSpeed = averageSpeed;
    }

    public Vehicle(String autoType, int averageSpeed, int fuelConsumption){
        this(autoType, averageSpeed);
        this.fuelConsumption = fuelConsumption;
    }


    public double getAverageTripTime(double distance) {
        try {
            if (averageSpeed == 0) {
                throw new Exception("Wrond speed value");
            }
            System.out.printf("%.2f km\n", distance / averageSpeed);
            return distance / averageSpeed;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public double getSpentFuel(double distance) {
        try {
            if (fuelConsumption == 0) {
                throw new Exception("Wrond fuel consumption");
            }
            System.out.printf("%.2f liters\n", distance * fuelConsumption / 100);
            return distance * fuelConsumption / 100;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

}
