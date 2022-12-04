package oop.Transport;

import oop.Transport.autoBody.AutoBodyTrack;

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

    @Override
    public boolean getDiagnosed() {
        return Math.random()>0.5;
    }
}
