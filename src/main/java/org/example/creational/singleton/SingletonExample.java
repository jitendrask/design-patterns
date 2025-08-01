package org.example.creational.singleton;

public class SingletonExample {
    private SingletonExample(){}
    private static SingletonExample singletonExampleObject;
    public static SingletonExample getInstance(){
        if(singletonExampleObject == null){
            synchronized (SingletonExample.class){
                if(singletonExampleObject == null){
                    singletonExampleObject = new SingletonExample();
                }
            }
        }
        return singletonExampleObject;
    }
}
