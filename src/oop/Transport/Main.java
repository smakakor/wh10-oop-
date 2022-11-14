package oop.Transport;

import oop.Transport.autoBody.AutoBodyBuss;
import oop.Transport.autoBody.AutoBodyCar;
import oop.Transport.autoBody.AutoBodyTrack;
import oop.exceptions.ExceptionsTask;

public class Main {
    public static void main(String[] args) {
        taskExceptions();
    }

    public static void taskTransport() {
        //лековые машины
        Car cars1 = new Car("Audi", "A8 50 L TDI quattro", 3.0, AutoBodyCar.SEDAN);
        System.out.println(cars1);
        cars1.pitStop();
        System.out.println("Максимальная скорость " + cars1.maxSpeed());
        System.out.println("Время круга " + cars1.betterTimeCircle());


        //автобусы
        Buss buss1 = new Buss("НефАЗ", "4208", 11.8, AutoBodyBuss.BIG);
        System.out.println(buss1);
        buss1.pitStop();

        //грузовые автомобили
        Truck trucks1 = new Truck("МАЗ", "5340", 6.4, AutoBodyTrack.N2);
        System.out.println(trucks1);
        trucks1.pitStop();
    }

    public static void taskExceptions() {
        boolean test = ExceptionsTask.inputErrorCheck("login","123_qwe","123_qwe");
        System.out.println(test);
    }

}
