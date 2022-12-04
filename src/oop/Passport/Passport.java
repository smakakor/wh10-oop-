package oop.Passport;

import java.util.Objects;

public class Passport {
    private final int number;
    private final String name;
    private final String surname;
    private final String patronymic;
    private final String dateOfBirtDay;

    public Passport(int number, String name, String surname, String patronymic, String dateOfBirtDay) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dateOfBirtDay = dateOfBirtDay;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getDateOfBirtDay() {
        return dateOfBirtDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(number, passport.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirtDay='" + dateOfBirtDay + '\'' +
                '}';
    }
}
