package oop.Driver;

import oop.Transport.Transport;

public class Driver<T extends Transport>  {
    private final String fullName;
    private String rights; // права
    private final int experience; // стаж
    private final T car;


    public Driver(String fullName, String rights, int experience, T car) {
        this.fullName = fullName;
        setRights(rights);
        this.experience = experience;
        this.car = car;
    }

    public String getFullName() {
        return fullName;
    }


    public String getRights() {
        return rights;
    }

    public void setRights(String rights) {
        if (rights == null) {
            throw new IllegalArgumentException("Необходимо указать категорию");
        }
        this.rights = rights;
    }

    public int getExperience() {
        return experience;
    }

    public T getCar() {
        return car;
    }

    public void startMoving() {
        System.out.println(getFullName() + " на " + car.getBrand() + " " + car.getModel() + " начал движение");
    }

    public void stopMoving() {
        System.out.println(getFullName() + " осстановился");
    }

    public void refuelTheAuto() {
        System.out.println(getFullName() + " запраляется");
    }

    @Override
    public String toString() {
        return "Водитель " + getFullName() + " управляет автомобилем " + car.getBrand() + car.getModel() + " и будет участвовать в заезде";
    }
}
