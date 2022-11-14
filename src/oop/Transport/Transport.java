package oop.Transport;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = ValidationUtils.validOrDEfault_String(brand, "default");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = ValidationUtils.validOrDEfault_String(model, "default");
    }
    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = Math.max(engineVolume, 0);
    }

    @Override
    public String toString() {
        return "Бренд " + getBrand() + '\'' +
                "; Модель " + getModel() + '\'' +
                "; объем двагателя: " + getEngineVolume() + " л.;";
    }


    public void startMoving() {
        System.out.println(getBrand() + getModel() + " начать движение");
    }

    public void finishMoving() {
        System.out.println(getBrand() + getModel() + " закончить движение");
    }

    public abstract boolean getDiagnosed ();

}
