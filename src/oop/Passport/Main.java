package oop.Passport;

public class Main {
    public static void main(String[] args) {
        Passport passport = new Passport(1, "Амир", "Шакиров", "Ильдарович", "10.06.2002");
        PassportList passportList = new PassportList();
        passportList.addPassport(passport);
        System.out.println(passportList.findByNumber(1));
    }
}
