package oop.Transport;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServesStanchion {
    private final Queue<Transport> transports = new ArrayDeque<>();

    private void add(Transport transport) {
        transports.offer(transport);
    }
    public void addCar(Car car) {
        add(car);
    }
    public void addTruck(Truck truck) {
        add(truck);
    }

    public void service() {
        Transport transport = transports.poll();
        if (transport != null) {
            System.out.println("servicing" + transport.getBrand() +" "+ transport.getModel());
        }
    }

}
