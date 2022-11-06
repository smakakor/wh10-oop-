package oop4.Transport;

//лековые машины
public class Car extends Transport implements Competing {

    // констуктор
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
