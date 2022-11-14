package oop.Driver;

import oop.Transport.Truck;

public class DriverC extends Driver<Truck>{
    public DriverC(String fullName, String rights, int experience, Truck car) {
        super(fullName, "C", experience, car);
    }
}
