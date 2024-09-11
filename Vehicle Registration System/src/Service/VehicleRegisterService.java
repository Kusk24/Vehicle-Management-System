package Service;

import Model.Car;
import Model.Motorcycle;
import Model.Truck;
import Model.Vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VehicleRegisterService {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Vehicle vehicle;
    private static Vehicle[] vehicleList = new Vehicle[100];

    public void getCommonInfo() throws IOException{
        System.out.print("Enter Vehicle Brand : ");
        String brand = br.readLine();
        System.out.print("Enter Vehicle Model : ");
        String model = br.readLine();
        vehicle = new Vehicle(brand, model);
    }

    public void createVehicle() throws IOException{
        getCommonInfo();
        getRegisterInfo();
        vehicleList[Vehicle.getVehicleCount()-1] = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public static Vehicle[] getVehicleList() {
        return VehicleRegisterService.vehicleList;
    }

    public void getRegisterInfo() throws IOException {

    }

    public void display(){
        for (int i = 0; i < Vehicle.getVehicleCount(); i++){
            VehicleRegisterService.getVehicleList()[i].displayInfo();
        }
        System.out.println();
    }

    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }
}
