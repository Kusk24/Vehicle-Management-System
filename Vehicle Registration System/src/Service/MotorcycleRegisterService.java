package Service;

import Model.Motorcycle;
import Model.Vehicle;

import java.io.IOException;

public class MotorcycleRegisterService extends VehicleRegisterService{
    private boolean hasSideCar;

    @Override
    public void getRegisterInfo() throws IOException {
        System.out.print("Does motorcycle have side car (yes/no) : ");
        boolean hasSideCar;
        if (br.readLine().equalsIgnoreCase("yes")) {
            hasSideCar = true;
        } else {
            hasSideCar = false;
        }
        setVehicle(new Motorcycle(this.getVehicle(), hasSideCar));
    }
}
