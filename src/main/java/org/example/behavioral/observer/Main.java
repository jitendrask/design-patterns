package org.example.behavioral.observer;

public class Main {
    public static void main(String[] args) {
/*
X and Y channels are observing news agency
 */
        NewsAgency newsAgency = new NewsAgency();
        NewsChannel x = new XChannel();
        NewsChannel y = new YChannel();
        newsAgency.addNewsSubscriber(x);
        newsAgency.addNewsSubscriber(y);
        newsAgency.newsUpdate(new News("Bright Sunny Day"));
    }
}

