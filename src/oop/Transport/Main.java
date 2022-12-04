package oop.Transport;

import jdk.jfr.Category;
import oop.Driver.Driver;
import oop.Driver.DriverB;
import oop.Market.Market;
import oop.Transport.List.MachanicalTypeTransport;
import oop.Transport.List.Mechanic;
import oop.Transport.List.Sponsor;
import oop.Transport.autoBody.AutoBodyBuss;
import oop.Transport.autoBody.AutoBodyCar;
import oop.Transport.autoBody.AutoBodyTrack;
import oop.exceptions.ExceptionsTask;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        taskMarket();
    }

    public static void taskTransport() {
        //лековые машины
        Car cars1 = new Car("Audi", "A8 50 L TDI quattro", 3.0, AutoBodyCar.SEDAN);
        System.out.println(cars1);


        //автобусы
        Buss buss1 = new Buss("НефАЗ", "4208", 11.8, AutoBodyBuss.BIG);
        System.out.println(buss1);


        //грузовые автомобили
        Truck trucks1 = new Truck("МАЗ", "5340", 6.4, AutoBodyTrack.N2);
        System.out.println(trucks1);

        // Водитель
        Driver<Car> driverB = new Driver<>("das","B",1, cars1);
        Driver<Buss> driverD = new Driver<>("das","D",1, buss1);
        System.out.println(driverB);
        //Спонсор
        Sponsor sponsor1 = new Sponsor("Amir",false,15000);
        //механик
        Mechanic mechanic = new Mechanic("Вася", "Company", MachanicalTypeTransport.BUS);
        // создание списка спонсоров и механиков
        buss1.addDriver(driverD);
        buss1.addMechanical(mechanic);
        buss1.addSponsor(sponsor1);

        List<Transport> transports = List.of(
                cars1,
                buss1,
                trucks1
        );
// сервис машины
        ServesStanchion servesStanchion = new ServesStanchion();
        servesStanchion.addCar(cars1);
        servesStanchion.addTruck(trucks1);
        servesStanchion.service();
        servesStanchion.service();
    }


    public static void taskExceptions() {
        boolean test = ExceptionsTask.inputErrorCheck("login","123_qwe","123_qwe");
        System.out.println(test);
    }

    public static void taskMarket() {



    }
}
