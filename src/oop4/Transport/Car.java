package oop4.Transport;

import oop4.Transport.autoBody.AutoBodyCar;

//лековые машины
public class Car extends Transport implements Competing {

    private AutoBodyCar autoBodyCar;

    // констуктор
    public Car(String brand, String model, double engineVolume,AutoBodyCar autoBodyCar) {
        super(brand, model, engineVolume);
        this.autoBodyCar= autoBodyCar;
    }

    public AutoBodyCar getAutoBodyCar() {
        return autoBodyCar;
    }

    @Override
    public void pitStop() {
        System.out.println(getBrand() + " " + getModel() + " ушёл на питстоп");
    }

    @Override
    public int betterTimeCircle() {
        int distance = 5000;
        return distance/maxSpeed();
    }

    @Override
    public int maxSpeed() {
        return 250;
    }
}
