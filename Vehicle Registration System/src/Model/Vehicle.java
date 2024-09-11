package Model;


public class Vehicle {
    public static final int MAX_Vehicle_Count = 1500;
    private String brand;
    private String model;
    private static int vehicleCount = 0;
    private int id;
    private Double rentPrice;

    public Vehicle(String brand, String model, double rentPrice){
        this.brand = brand;
        this.model = model;
        vehicleCount++;
        this.rentPrice = rentPrice;
        this.id = vehicleCount;
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

    public double getRentPrice() {
        return this.rentPrice;
    }

    public int getId(){
        return this.id;
    }
}
