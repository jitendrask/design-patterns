package org.example.structural.bridge;

/*
BRIDGE DESIGN PATTERN:

Bridge Pattern decouples an abstraction from its
implementation so that the two can vary independently

Here Animals can breathe in various methods.
If an animal is extinct then the way it could breathe
will still exist.

In this example you can see no Insects but the process
still exist.
 */
public class Main {
    public static void main(String[] args) {
        Animal cow = new Cow(new MammalsBreathe());
        Animal shark = new Shark(new FishBreathe());
        System.out.println(shark.breatheProcess());
        System.out.println(cow.breatheProcess());
    }
}
