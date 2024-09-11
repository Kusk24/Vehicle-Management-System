package Model;


public class Vehicle {
    private String brand;
    private String model;
    private static int vehicleCount;

    public Vehicle(String brand, String model){
        this.brand = brand;
        this.model = model;
        vehicleCount++;
    }

    public void displayInfo(){
        System.out.println("Vehicle brand name = "+ this.brand);
        System.out.println("Vehicle model = "+ this.model);
    }

    public static int getVehicleCount() {
        return vehicleCount;
    }
}
