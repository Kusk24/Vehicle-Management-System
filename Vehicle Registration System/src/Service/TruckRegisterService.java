package Service;

import Model.Truck;

import java.io.IOException;

public class TruckRegisterService extends VehicleRegisterService{

    @Override
    public void getRegisterInfo() throws IOException {
        System.out.print("Enter payload Capacity of Truck : ");
        int payloadCapacity = Integer.parseInt(br.readLine());
        setVehicle(new Truck(this.getVehicle(), payloadCapacity));
    }
}
