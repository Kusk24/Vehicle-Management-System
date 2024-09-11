package Dao;

import Model.Rental;

public class RentalDao {
    private static Rental[] RentalDB = new Rental[Rental.MAX_Rental_Count];

    public void create(Rental rental){
        RentalDB[Rental.getRentalCount()-1] = rental;
    }

    public void delete(Rental rental){

    }

    public static Rental[] getAll(){
        return RentalDB;
    }

    public static Rental findById(int id){
        for(int i = 0; i < Rental.getRentalCount(); i++){
            if (RentalDB[i].getRentalId() == id){
                return RentalDB[i];
            }
        }
        return null;
    }
}
