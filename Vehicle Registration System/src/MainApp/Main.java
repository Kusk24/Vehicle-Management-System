package MainApp;

import Model.Vehicle;
import Service.CarRegisterService;
import Service.MotorcycleRegisterService;
import Service.TruckRegisterService;
import Service.VehicleRegisterService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String type;
        String flag;
        VehicleRegisterService service = new VehicleRegisterService();

        do {
            System.out.print("Enter Vehicle Type (Car/Truck/Motorcycle): ");
            type = br.readLine();
            if (type.equalsIgnoreCase("Car")) {
                service = new CarRegisterService();
            } else if (type.equalsIgnoreCase("Truck")) {
                service = new TruckRegisterService();
            } else if (type.equalsIgnoreCase("Motorcycle")) {
                service = new MotorcycleRegisterService();
            }
            service.createVehicle();
            System.out.print("Do you want to add another vehicle: (yes/no): ");
            flag = br.readLine();
        } while(flag.equalsIgnoreCase("Yes"));;
        service.display();
    }
}