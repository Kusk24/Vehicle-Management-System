package Model;

public class Rental {
    public static final int MAX_Rental_Count = 3000;
    private Customer customer;
    private Vehicle vehicle;
    private int rentDays;
    private Double totalPrice;
    private static int rentalCount;
    private int rentalId;

    public Rental(Customer customer, Vehicle vehicle, int rentDays){
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentDays = rentDays;
        this.totalPrice = vehicle.getRentPrice() * rentDays;
        rentalCount++;
        this.rentalId = rentalCount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public int getRentDays() {
        return rentDays;
    }

    public static int getRentalCount() {
        return rentalCount;
    }

    public int getRentalId() {
        return rentalId;
    }
}
