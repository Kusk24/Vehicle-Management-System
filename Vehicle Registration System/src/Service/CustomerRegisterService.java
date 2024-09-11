package Service;

import Dao.CustomerDao;
import Model.Customer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CustomerRegisterService {
    public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public Customer customer;
    public CustomerDao customerDao;

    public void getCommonInfo() throws IOException {
        System.out.print("Enter Customer name: ");
        String name = br.readLine();
        System.out.print("Enter Customer id: ");
        int id = Integer.parseInt(br.readLine());
        customer = new Customer(id, name);
    }

    public void createCustomer() throws IOException {
        getCommonInfo();
        customerDao.create(customer);
    }
}
