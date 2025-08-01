package org.example.creational.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonExample singletonExample1 = SingletonExample.getInstance();
        SingletonExample singletonExample2 = SingletonExample.getInstance();
        System.out.println(singletonExample1.equals(singletonExample2));

        SingletonExampleEnum singletonExampleEnum = SingletonExampleEnum.INSTANCE;
    }
}
