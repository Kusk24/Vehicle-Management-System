package Dao;

import Model.Customer;

public class CustomerDao {
    private static Customer[] CustomerDB = new Customer[Customer.MAX_Customer_Count];

    public void create(Customer customer){
        CustomerDB[Customer.getCustomerCount() - 1] = customer;
    }

    public void delete(Customer customer){
//        for(int i = 0; i < Customer.getCustomerCount(); i++){
//            if (CustomerDB[i] == customer){
//                continue;
//            }
//        }
    }

    public static Customer[] getAll() {
        return CustomerDB;
    }

    public static Customer findById(int id){
        for(int i = 0; i < Customer.getCustomerCount(); i ++){
            if (CustomerDB[i].getId() == id){
                return CustomerDB[i];
            }
        }
        return null;
    }
}
