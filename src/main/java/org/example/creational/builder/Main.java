package org.example.creational.builder;

public class Main {
    public static void main(String[] args) {

        Car car = Car.builder()
                .setBreaks("Disk")
                .setWheels("Apollo")
                .setSteeringWheel("Power")
                .build();
    }
}
