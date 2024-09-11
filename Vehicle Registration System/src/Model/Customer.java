package Model;

public class Customer {
    public static final int MAX_Customer_Count = 1500;
    private int id;
    private String name;
    private static int customerCount;

    public Customer (int id, String name){
        this.id = id;
        this.name = name;
        customerCount++;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public static int getCustomerCount() {
        return customerCount;
    }
}
