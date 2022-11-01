package oop3Work3;

import oop3.ValidationUtils;

import java.util.Objects;

public abstract class Animals{
    private final String nameAnimals;
    private int age;

    public Animals(String nameAnimals, int age) {
        this.nameAnimals = ValidationUtils.validOrDEfault_String(nameAnimals,"error");
        setAge(age);
    }

    public String getNameAnimals() {
        return nameAnimals;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = ValidationUtils.validOrDEfault_Int(age,0);
    }

    public abstract void eat();

    public final void slip() {
        System.out.println(getNameAnimals() + " спит");
    }

    public abstract void move();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(nameAnimals, animals.nameAnimals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAnimals, age);
    }
}
