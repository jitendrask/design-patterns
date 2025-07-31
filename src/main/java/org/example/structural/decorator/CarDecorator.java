package org.example.structural.decorator;

public abstract class CarDecorator implements Car{
    Car car;
    public CarDecorator(Car car){
        this.car = car;
    }

    public String build() {
        return car.build();
    }

}
