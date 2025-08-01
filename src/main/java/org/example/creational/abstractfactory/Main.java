package org.example.creational.abstractfactory;

import org.example.creational.abstractfactory.petfactory.DogFactory;
import org.example.creational.abstractfactory.petfactory.CatFactory;
/*
We Can see that once the factories are ready
we just have to create Pet Factories and then call it
 */
public class Main {
    public static void main(String[] args) {

        Pet petDog = new Pet(new DogFactory());
        petDog.showPet();

        Pet petCat = new Pet(new CatFactory());
        petCat.showPet();
    }
}
