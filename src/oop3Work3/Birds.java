package oop3Work3;

import oop3.ValidationUtils;

public abstract class Birds extends Animals{

    private final String habitat;  //среда обитания

    public Birds(String nameAnimals, int age, String habitat) {
        super(nameAnimals, age);
        this.habitat = ValidationUtils.validOrDEfault_String(habitat,"error");
    }

    public String getHabitat() {
        return habitat;
    }
    public final void hunts() {
        System.out.println(getNameAnimals() + "Охотится");
    }
}
