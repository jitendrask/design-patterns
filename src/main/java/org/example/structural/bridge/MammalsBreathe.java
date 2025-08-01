package org.example.structural.bridge;

public class MammalsBreathe implements Breathe{
    @Override
    public String process() {
        return "Lungs";
    }
}
