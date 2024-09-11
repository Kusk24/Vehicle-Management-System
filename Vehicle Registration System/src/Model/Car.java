package Model;

public class Car extends Vehicle {
    private int doors;

    public Car (String brand, String model, int doors){
        super(brand, model);
        this.doors = doors;
    }

    public Car(Vehicle vehicle, int doors){
        super(vehicle);
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        System.out.println("*****Car*****");
        super.displayInfo();
        System.out.println("This Car has "+ this.doors + " doors.");
    }
}
