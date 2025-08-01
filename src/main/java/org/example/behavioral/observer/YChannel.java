package org.example.behavioral.observer;

public class YChannel implements NewsChannel {
    @Override
    public void newsUpdate(News news) {
        System.out.println("New Update" + news.text());
    }
}
