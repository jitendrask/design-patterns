package org.example.creational.abstractfactory.petfactory;

import org.example.creational.abstractfactory.AnimalFactory;
import org.example.creational.abstractfactory.actions.See;
import org.example.creational.abstractfactory.actions.Speak;

public class CatFactory implements AnimalFactory {
    @Override
    public See getSee() {
        return new See() {
            @Override
            public boolean identifyColors() {
                return false;
            }
        };
    }

    @Override
    public Speak getSpeak() {
        return new Speak() {
            @Override
            public String doSpeak() {
                return "Mew Mew";
            }
        };
    }
}
