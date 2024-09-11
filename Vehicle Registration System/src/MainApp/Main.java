package MainApp;

import Service.VehicleRegisterService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        VehicleRegisterService service = new VehicleRegisterService();

        service.getVehicleInfo();

        service.display();
    }
}