package edu.eci.arep.persistence;

public class AppPersistenceException extends Exception {

    public static final String CAR_NOT_FOUND = "Car not found";

    public AppPersistenceException(){
        super();
    }

    public AppPersistenceException(String msg){
        super(msg);
    }

}
