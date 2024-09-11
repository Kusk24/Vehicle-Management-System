package Service;

import Model.Car;
import Model.Truck;
import Model.Vehicle;

import java.io.IOException;

public class TruckRegisterService extends VehicleRegisterService{
    private int payloadCapacity;

    @Override
    public void getRegisterInfo() throws IOException {
        System.out.print("Enter payload Capacity of Truck : ");
        payloadCapacity = Integer.parseInt(br.readLine());
        setVehicle(new Truck(this.getVehicle(), this.payloadCapacity));
    }
}
