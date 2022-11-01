package oop3Work3;

import oop3.ValidationUtils;

// Млекопитающие
public abstract class Mammals extends Animals {

    private final String habitat;  //среда обитания
    private final int travelSpeed;  //скорость перемещения


    public Mammals(String nameAnimals, int age, String habitat, int travelSpeed) {
        super(nameAnimals, age);
        this.habitat = ValidationUtils.validOrDEfault_String(habitat,"error");
        this.travelSpeed = ValidationUtils.validOrDEfault_Int(travelSpeed,0);
    }

    public String getHabitat() {
        return habitat;
    }

    public int getTravelSpeed() {
        return travelSpeed;
    }

    public void walk() {
        System.out.println(" гуляет");
    }

}
