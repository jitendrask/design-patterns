package org.example.creational.factory;

public class ElectricCar implements Car{

    @Override
    public CarType getCarType() {
        return CarType.EV;
    }
}
