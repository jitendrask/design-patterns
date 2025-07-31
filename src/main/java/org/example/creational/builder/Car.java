package org.example.creational.builder;

public class Car {
    private String steeringWheel;
    private String wheels;
    private String breaks;

    public Car(CarBuilder carBuilder){
        this.breaks = carBuilder.getBreaks();
        this.steeringWheel = carBuilder.getSteeringWheel();
        this.wheels= carBuilder.getWheels();

    }

    public String getSteeringWheel() {
        return steeringWheel;
    }

    public String getWheels() {
        return wheels;
    }

    public String getBreaks() {
        return breaks;
    }

    public static CarBuilder builder(){
        return new CarBuilder();
    }
}
