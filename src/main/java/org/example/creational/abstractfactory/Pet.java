package org.example.creational.abstractfactory;

import org.example.creational.abstractfactory.actions.See;
import org.example.creational.abstractfactory.actions.Speak;

public class Pet {
    private See see;
    private Speak speak;

    public Pet(AnimalFactory animalFactory){
        this.see = animalFactory.getSee();
        this.speak = animalFactory.getSpeak();
    }

    public void showPet(){
        System.out.println("Can identify Color " + see.identifyColors());
        System.out.println("Pet says : "+ speak.doSpeak());
    }

}
