package oop.Transport.List;

import java.util.Objects;

public class Sponsor {

    private final String name;
    private final boolean company;
    private final int symHelp;

    public Sponsor(String name, boolean company, int symHelp) {
        this.name = name;
        this.company = company;
        this.symHelp = symHelp;
    }

    public void sponsorARace(){
        System.out.printf("%s спонсирует заезд на сумму %d", getName(), getSymHelp());
    }

    public String getName() {
        return name;
    }

    public boolean isCompany() {
        return company;
    }

    public int getSymHelp() {
        return symHelp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
