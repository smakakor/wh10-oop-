package oop4.Driver;
import oop4.Transport.Car;

public class DriverB extends Driver<Car> {

    public DriverB(String fullName, boolean rights, int experience, Car car) {
        super(fullName, "B", experience, car);
    }
}
