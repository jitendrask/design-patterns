package org.example.structural.decorator;

public class ParkingSensorDecorator extends CarDecorator{
    public ParkingSensorDecorator(Car car) {
        super(car);
    }

    public String build(){
        return car.build() + addParkingSensor();
    }

    public String addParkingSensor(){
        return " :Parking Sensor";
    }
}
