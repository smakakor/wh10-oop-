package oop4.Transport;

import oop4.Transport.autoBody.AutoBodyBuss;
import oop4.Transport.autoBody.AutoBodyCar;

// автобусы
public class Buss extends Transport implements Competing {

    private AutoBodyBuss autoBodyBuss;

    // констуктор
    public Buss(String brand, String model, double engineVolume,AutoBodyBuss autoBodyBuss) {
        super(brand, model, engineVolume);
        this.autoBodyBuss = autoBodyBuss;
    }

    @Override
    public void pitStop() {
        System.out.println(getBrand() + " " + getModel() + " ушёл на питстоп");
    }

    @Override
    public int betterTimeCircle() {
        return 0;
    }

    @Override
    public int maxSpeed() {
        return 0;
    }
}
