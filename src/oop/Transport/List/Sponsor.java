package oop.Transport.List;

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
}
