package oop4.Transport;

import oop4.Transport.autoBody.AutoBodyTrack;

// грузовые автомобили
public class Truck extends Transport implements Competing {

    private AutoBodyTrack autoBodyTrack;

    // констуктор
    public Truck(String brand, String model, double engineVolume, AutoBodyTrack autoBodyTrack) {
        super(brand, model, engineVolume);
        this.autoBodyTrack = autoBodyTrack;
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
