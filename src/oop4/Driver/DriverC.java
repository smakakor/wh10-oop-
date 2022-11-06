package oop4.Driver;

import oop4.Transport.Truck;

public class DriverC extends Driver<Truck>{
    public DriverC(String fullName, String rights, int experience, Truck car) {
        super(fullName, "C", experience, car);
    }
}
