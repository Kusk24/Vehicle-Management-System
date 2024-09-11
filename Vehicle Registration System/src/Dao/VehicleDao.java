package Dao;

import Model.Vehicle;

public class VehicleDao {
    private static Vehicle[] VehicleDB = new Vehicle[Vehicle.MAX_Vehicle_Count];

    public void create(Vehicle vehicle){
        VehicleDB[Vehicle.getVehicleCount() - 1] = vehicle;
    }

    public void delete(Vehicle vehicle){

    }

    public static Vehicle[] getAll() {
        return VehicleDB;
    }

    public static Vehicle findById(int id){
        for (int i = 0; i < Vehicle.getVehicleCount(); i++){
            if (VehicleDB[i].getId() == id){
                return VehicleDB[i];
            }
        }
        return null;
    }

}
