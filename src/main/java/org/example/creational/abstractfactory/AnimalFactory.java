package org.example.creational.abstractfactory;

import org.example.creational.abstractfactory.actions.See;
import org.example.creational.abstractfactory.actions.Speak;

public interface AnimalFactory {

    See getSee();
    Speak getSpeak();
}
