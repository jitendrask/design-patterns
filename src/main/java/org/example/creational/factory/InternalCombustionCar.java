package org.example.creational.factory;

public class InternalCombustionCar implements Car{
    @Override
    public CarType getCarType() {
        return CarType.FOSSIL;
    }
}
