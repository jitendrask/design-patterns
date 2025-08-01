package org.example.creational.factory;

public class CarFactory {
    private CarFactory(){}

    public static Car getCarInstance(CarType carType){
        return switch (carType){
            case EV -> new ElectricCar();
            case FOSSIL -> new InternalCombustionCar();
        };
    }
}
