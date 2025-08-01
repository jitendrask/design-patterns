package org.example.structural.bridge;

public abstract class Animal {
    private Breathe breathe;

    public Animal(Breathe breathe){
        this.breathe = breathe;
    }

    public String breatheProcess(){
        return breathe.process();
    }
}
