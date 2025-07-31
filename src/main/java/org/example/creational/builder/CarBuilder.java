package org.example.creational.builder;

public class CarBuilder {
    private String steeringWheel;
    private String wheels;
    private String breaks;

    public CarBuilder setSteeringWheel(String steeringWheel) {
        this.steeringWheel = steeringWheel;
        return this;
    }

    public CarBuilder setWheels(String wheels) {
        this.wheels = wheels;
        return this;
    }

    public CarBuilder setBreaks(String breaks) {
        this.breaks = breaks;
        return this;
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

    public Car build(){
        return new Car(this);
        }
    }

