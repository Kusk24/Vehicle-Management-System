package Service;

import Dao.CustomerDao;
import Dao.RentalDao;
import Dao.VehicleDao;
import Model.Customer;
import Model.Rental;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RentalRegisterService {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public Rental rental;
    public RentalDao rentalDao;

    public void getCommonInfo() throws IOException {
        System.out.print("Enter Customer id: ");
        int customerId = Integer.parseInt(br.readLine());
        System.out.print("Enter Vehicle id: ");
        int vehicleId = Integer.parseInt(br.readLine());
        System.out.print("Enter Rental Days");
        int rentDay = Integer.parseInt(br.readLine());
        rental = new Rental(CustomerDao.findById(customerId), VehicleDao.findById(vehicleId), rentDay);
    }

    public void createRental() throws IOException {
        getCommonInfo();
        rentalDao.create(rental);
    }
}
