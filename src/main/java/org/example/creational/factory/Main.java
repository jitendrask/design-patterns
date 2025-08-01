package org.example.creational.factory;

public class Main {
    public static void main(String[] args) {

        System.out.println(CarFactory.getCarInstance(CarType.FOSSIL).getCarType());
        System.out.println(CarFactory.getCarInstance(CarType.EV).getCarType());
    }
}
