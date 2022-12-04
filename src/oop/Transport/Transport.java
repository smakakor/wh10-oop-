package oop.Transport;

import oop.Driver.Driver;
import oop.Transport.List.Mechanic;
import oop.Transport.List.Sponsor;

import java.util.*;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;
    private  List<Driver<?>> driver = new ArrayList<>();
    private final Set<Sponsor> sponsors = new HashSet<>();
    private final Set<Mechanic> mechanics = new HashSet<>();

    public Transport(String brand, String model, double engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
    }

    public List<Driver<?>> getDriver() {
        return driver;
    }

    public void setDriver(List<Driver<?>> driver) {
        this.driver = driver;
    }

    public void addDriver(Driver driver) {
        this.driver.add(driver);
    }
    public void addSponsor(Sponsor... sponsor) {
        this.sponsors.addAll(Arrays.asList(sponsor));
    }
    public void addMechanical(Mechanic mechanic) {
        this.mechanics.add(mechanic);
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public Set<Mechanic> getMechanics() {
        return mechanics;
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

    public abstract boolean getDiagnosed();

}
