package oop.Transport.List;

import oop.Transport.Transport;

import java.util.ArrayList;
import java.util.Objects;

public class Mechanic {
    private final String nameOfSurname;
    private final String companyMechanical;
    private final MachanicalTypeTransport type;

    public Mechanic(String nameOfSurname,
                    String companyMechanical,
                    MachanicalTypeTransport type) {
        this.nameOfSurname = nameOfSurname;
        this.companyMechanical = companyMechanical;
        this.type = type;
    }

    public void CarryOutMaintenance (){
        System.out.printf("Механик %s проводит техобслуживание %s", nameOfSurname, type);
    }

    public void blameTransport(Transport car) {
        System.out.printf("Механик %s чинит %s %s", nameOfSurname, car.getBrand(), car.getModel());
    }

    public String getNameOfSurname() {
        return nameOfSurname;
    }

    public String getCompanyMechanical() {
        return companyMechanical;
    }

    public MachanicalTypeTransport getType() {
        return type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(nameOfSurname, mechanic.nameOfSurname) && Objects.equals(companyMechanical, mechanic.companyMechanical);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfSurname, companyMechanical);
    }
}
