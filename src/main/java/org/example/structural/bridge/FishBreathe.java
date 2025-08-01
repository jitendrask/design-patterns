package org.example.structural.bridge;

public class FishBreathe implements Breathe{
    @Override
    public String process() {
        return "Gills";
    }
}
