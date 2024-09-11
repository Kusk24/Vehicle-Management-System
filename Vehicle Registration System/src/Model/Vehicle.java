package Model;


public class Vehicle {
    private String brand;
    private String model;
    private static int vehicleCount = 0;

    public Vehicle(String brand, String model){
        this.brand = brand;
        this.model = model;
        vehicleCount++;
    }

    public Vehicle(Vehicle vehicle){
        this.brand = vehicle.getBrand();
        this.model = vehicle.getModel();
    }

    public void displayInfo(){
        System.out.println("Vehicle brand name = "+ this.brand);
        System.out.println("Vehicle model = "+ this.model);
    }

    public static int getVehicleCount() {
        return vehicleCount;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }
}
