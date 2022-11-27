package oop.Driver;
import oop.Transport.Car;

import javax.sound.midi.Soundbank;

public class DriverB extends Driver<Car> {

    public DriverB(String fullName, String rights, int experience, Car car) {
        super(fullName, rights, experience, car);
    }
    public void test () {
        System.out.println("yes");
    }
}
