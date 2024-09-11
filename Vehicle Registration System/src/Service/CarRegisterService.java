package Service;

import Model.Car;

import java.io.IOException;

public class CarRegisterService extends VehicleRegisterService{

    @Override
    public void getRegisterInfo() throws IOException {
        System.out.print("Enter numbers of car doors : ");
        int doors = Integer.parseInt(br.readLine());
        setVehicle(new Car(this.getVehicle(), doors));
    }
}
