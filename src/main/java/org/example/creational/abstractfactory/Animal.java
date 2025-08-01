package org.example.creational.abstractfactory;

import org.example.creational.abstractfactory.actions.See;
import org.example.creational.abstractfactory.actions.Speak;

public interface Animal {
    public See getEyes();
    public Speak getVoice();
}
