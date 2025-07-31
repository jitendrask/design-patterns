package org.example.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Car myCar = new View360(new ParkingSensorDecorator(new BaseCar()));
        System.out.println(myCar.build());
    }
}
