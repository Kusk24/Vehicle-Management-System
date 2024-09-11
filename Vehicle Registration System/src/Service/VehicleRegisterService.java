package Service;

import Model.Car;
import Model.Motorcycle;
import Model.Truck;
import Model.Vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VehicleRegisterService {
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private String brand;
    private String model;
    private String type;
    private String flag;
    private Vehicle[] vehicleList = new Vehicle[100];

    public void getVehicleInfo() throws IOException {
        do {
            this.getCommonInfo();
            if (type.equalsIgnoreCase("Car")) {
                this.getCarInfo();
            } else if (type.equalsIgnoreCase("Truck")) {
                this.getTruckInfo();
            } else if (type.equalsIgnoreCase("Motorcycle")) {
                this.getMotorcycleInfo();
            }
            System.out.print("Do you want to add another vehicle: (yes/no): ");
            flag = br.readLine();
        } while(flag.equalsIgnoreCase("Yes"));;
    }

    public void getCommonInfo() throws IOException{
        System.out.print("Enter Vehicle Brand : ");
        this.brand = br.readLine();
        System.out.print("Enter Vehicle Model : ");
        this.model = br.readLine();
        System.out.print("Enter Vehicle Type (Car/Truck/Motorcycle): ");
        this.type = br.readLine();
    }

    public void getCarInfo() throws IOException{
        System.out.print("Enter numbers of car doors : ");
        int doors = Integer.parseInt(br.readLine());
        vehicleList[Vehicle.getVehicleCount()] = new Car(brand, model, doors);
    }

    public void getTruckInfo() throws IOException{
        System.out.print("Enter payload Capacity of Truck : ");
        int payloadCapacity = Integer.parseInt(br.readLine());
        vehicleList[Vehicle.getVehicleCount()] = new Truck(brand, model, payloadCapacity);
    }



    public void getMotorcycleInfo() throws IOException{
        System.out.print("Does motorcycle have side car (yes/no) : ");
        boolean hasSideCar;
        if (br.readLine().equalsIgnoreCase("yes")) {
            hasSideCar = true;
        } else {
            hasSideCar = false;
        }
        vehicleList[Vehicle.getVehicleCount()] = new Motorcycle(brand, model, hasSideCar);
    }

    public void display(){
        for (int i = 0; i < Vehicle.getVehicleCount(); i++){
            vehicleList[i].displayInfo();
        }
        System.out.println();
    }
}
