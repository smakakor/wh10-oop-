package oop.Driver;
import oop.Transport.Buss;
public class DriverD extends Driver <Buss> {
    public DriverD(String fullName, boolean rights, int experience, Buss car) {
        super(fullName, "D", experience, car);
    }
}
