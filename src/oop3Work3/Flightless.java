package oop3Work3;

import oop3.ValidationUtils;

public final class Flightless extends Birds{
    private final String moveType; //тип передвижения

    public Flightless(String nameAnimals, int age, String habitat, String moveType) {
        super(nameAnimals, age, habitat);
        this.moveType = ValidationUtils.validOrDEfault_String(moveType,"error");
    }

    public String getMoveType() {
        return moveType;
    }

    @Override
    public final void eat() {
        System.out.println(getNameAnimals() +" кушает");
    }

    @Override
    public final void move() {
        System.out.println(getNameAnimals() + " идет");
    }

    public final void walks() { // гуляет
        System.out.println(getNameAnimals() + " гуляет");
    }

    @Override
    public String toString() {
        return "Кличка животного " + getNameAnimals() + "; возраст " + getAge() + "; среда обитания "+ getHabitat()
                + "; тип пердевижения" + getMoveType();
    }
}
