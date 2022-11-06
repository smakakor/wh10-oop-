package oop4.Transport;

// грузовые автомобили
public class Truck extends Transport implements Competing {


    // констуктор
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
