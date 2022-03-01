package classes;

public class Vehicle {
    String vehicle_type = null;
    int vehicle_average_velocity = -1;
    int consumption_per_100_km = -1;

    public Vehicle(String vehicle_type,int consumption_per_100_km,int vehicle_average_velocity) {
        setVehicle_type(vehicle_type);
        setVehicle_average_velocity(vehicle_average_velocity);
        setConsumption_per_100_km(consumption_per_100_km);
    }


    public void setConsumption_per_100_km(int consumption_per_100_km) {
        if (consumption_per_100_km <= 0) {
            throw new RuntimeException("consumption_per_100_km is <= 0");
        }
        this.consumption_per_100_km = consumption_per_100_km;
    }

    public void setVehicle_average_velocity(int vehicle_average_velocity) {
        if (vehicle_average_velocity <= 0) {
            throw new RuntimeException("vehicle_average_velocity is <= 0");
        }
        this.vehicle_average_velocity = vehicle_average_velocity;
    }

    public void setVehicle_type(String vehicle_type) {
        if ((vehicle_type.equals(""))||vehicle_type==null ) {
            throw new RuntimeException("Invalid vehicle type");
        }
        this.vehicle_type = vehicle_type;
    }

    public int calculateTimeForDistance(int distance) {
        if ((distance < 0)|| (vehicle_average_velocity == -1)) {
            throw new RuntimeException("Invalid distance or vehicle_average_velocity is not initalized");
        }
        return distance/vehicle_average_velocity;
    }
    public int calculateFuelForDistance(int distance) {
        if ((distance < 0)||(consumption_per_100_km == -1)) {
            throw new RuntimeException("Invalid distance or consumption_per_100_km is not initalized");
        }
        return (distance/100)*vehicle_average_velocity;
    }

}
