package oop3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        taskBuss();
    }

    public static void taskHuman() {
        Human human1 = new Human("","",-35,"");
        human1.printHuman();
        Human human2 = new Human("Аня","Москва",29,"методистом образовательных программ");
        human2.printHuman();
        Human human3 = new Human("Катя","Калининград",28,"продакт-менеджером");
        human3.printHuman();
        Human human4 = new Human("Артем","Москва",27,"директором по развитию бизнеса");
        human4.printHuman();
        Human human5 = new Human("Владимир", "Казань", 21, "Не работает");
        human5.printHuman();
    }

    public static void taskFlower() {
        Flower flower1 = new Flower("Rose", "Holland", 35.59, 0);
        System.out.println(flower1);
        Flower flower2 = new Flower("Chrysanthemum","", 15,5);
        System.out.println(flower2);
        Flower flower3 = new Flower("Peony","England",69.9,1);
        System.out.println(flower3);
        Flower flower4 = new Flower("Gypsophila","Turkey",19.9,10);
        System.out.println(flower4);

    }

    public static void taskCar() {
        /*oop3.Car car1 = new oop3.Car("","",0,"",0,"");
        car1.PrintCar();
        oop3.Car car2 = new oop3.Car("Audi","A8 50 L TDI quattro",3.0,"Черный",2015,"Германия");
        car2.PrintCar();
        oop3.Car car3 = new oop3.Car("BMW","Z8",3.0,"Черный",2021,"Германия");
        car3.PrintCar();
        oop3.Car car4 = new oop3.Car("Kia","Sportage 4-го поколения",2.4,"Крвсный",2018,"Южной Корее");
        car4.PrintCar();*/
        Car car5 = new Car("Hyundai","Avante",1.6,"Оранжевый",2016,
                "Южной Корее",200 ,"КПП", "седан","X000XX000",
                5,true, new Car.Key(false,true),
                new Car.Insurance(LocalDate.now(),2000,"987654321"));
        car5.PrintCar();
        car5.refill();
    }

    public static void taskTrain() {
        Train train1 = new Train("Ласточка","B-901",2011,"Russia",
                null,301,3500,null, "Belorussky railway station",
                "Minsk-Passenger",11);
        System.out.println(train1);
        train1.refill();
        Train train2 = new Train("Ленинград","D-125",2019 ,"Russia",
                null,270,1700,"2 hour", "Leningradsky railway station",
                "Leningrad-Passenger",8);
        System.out.println(train2);
        train2.refill();
    }

    public static void taskBuss() {
        Buss buss1 = new Buss(null, null,0,null,null,
                0);
        System.out.println(buss1);
        buss1.refill();
        Buss buss2 = new Buss("Урал","3255",2001,"Russia",
                null,180);
        System.out.println(buss2);
        buss2.refill();
    }
}
