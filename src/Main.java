public class Main {
    public static void main(String[] args) {
        taskCar();
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

    public static void taskCar() {
        /*Car car1 = new Car("","",0,"",0,"");
        car1.PrintCar();
        Car car2 = new Car("Audi","A8 50 L TDI quattro",3.0,"Черный",2015,"Германия");
        car2.PrintCar();
        Car car3 = new Car("BMW","Z8",3.0,"Черный",2021,"Германия");
        car3.PrintCar();
        Car car4 = new Car("Kia","Sportage 4-го поколения",2.4,"Крвсный",2018,"Южной Корее");
        car4.PrintCar();*/
        Car car5 = new Car("Hyundai","Avante",1.6,"Оранжевый",2016,"Южной Корее",
                "КПП", "седан","X000XX000", 5,true, null,null);
        car5.PrintCar();
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
}
