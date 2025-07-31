package org.example.structural.decorator;

public class View360 extends CarDecorator{
    public View360(Car car) {
        super(car);
    }

    public String build(){
        return car.build() + add360View();
    }

    public String add360View(){
        return " :360 degree View Camera";
    }
}
