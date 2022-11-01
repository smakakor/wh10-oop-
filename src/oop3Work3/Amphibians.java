package oop3Work3;

import oop3.ValidationUtils;

// земноводные
public class Amphibians extends Animals {
    private final String livingEnvironment;

    public Amphibians(String nameAnimals, int age, String livingEnvironment) {
        super(nameAnimals, age);
        this.livingEnvironment = ValidationUtils.validOrDEfault_String(livingEnvironment,"error");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    @Override
    public final void eat() {
        System.out.println(getNameAnimals()+ " кушает");
    }

    @Override
    public final void move() {
        System.out.println(getNameAnimals() + " плывет");
    }

    public final void hunts() {
        System.out.println(getNameAnimals() + " Охотится");
    }

    @Override
    public String toString() {
        return "Кличка животного " + getNameAnimals() + "; возраст " + getAge() + "; среда обитания "+ getLivingEnvironment();
    }


}
