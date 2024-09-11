package Model;

public class Motorcycle extends Vehicle{
    private boolean hasSidecar;

    public Motorcycle(String brand, String model, boolean hasSidecar){
        super(brand, model);
        this.hasSidecar = hasSidecar;
    }

    public Motorcycle(Vehicle vehicle, boolean hasSideCar){
        super(vehicle);
        this.hasSidecar = hasSideCar;
    }

    @Override
    public void displayInfo() {
        System.out.println("*****Motorcycle*****");
        super.displayInfo();
        if (this.hasSidecar) {
            System.out.println("This motorcycle has side car.");
        } else {
            System.out.println("This motorcycle does not have side car.");
        }
    }
}
