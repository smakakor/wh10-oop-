package oop3Work3;

import oop3.ValidationUtils;

// хищники
public final class Predators extends Mammals{
    private final String typeOfFood; //тип еды

    public Predators(String nameAnimals, int age, String habitat, int travelSpeed, String typeOfFood) {
        super(nameAnimals, age, habitat, travelSpeed);
        this.typeOfFood = ValidationUtils.validOrDEfault_String(typeOfFood,"мясо");
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }


    @Override
    public final void eat() {
        System.out.println(getNameAnimals()+ " кушает");
    }

    @Override
    public final void move() {
        System.out.println(getNameAnimals() + " идет");
    }

    public final void hunts() {
        System.out.println(getNameAnimals() + " Охотится");
    }

    @Override
    public String toString() {
        return "Кличка животного " + getNameAnimals() + "; возраст " + getAge() + "; среда обитания "+ getHabitat()
                + "; скорость перемещения " + getTravelSpeed() + "; тип пищи " + getTypeOfFood();
    }
}

