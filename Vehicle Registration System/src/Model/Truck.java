package Model;

public class Truck extends Vehicle {
    private int payloadCapacity;

    public Truck (String brand, String model, int payloadCapacity) {
        super(brand, model);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("*****Truck*****");
        super.displayInfo();
        System.out.println("This truck has payload capacity of "+this.payloadCapacity + ".");
    }
}
