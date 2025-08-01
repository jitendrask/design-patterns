package org.example.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    List<News> newsList = new ArrayList<>();
    List<NewsChannel> newsSubscribers = new ArrayList<>();

    public void addNewsSubscriber(NewsChannel newsChannel){
        newsSubscribers.add(newsChannel);
    }

    public void deleteSubscriber(NewsChannel newsChannel){
        newsSubscribers.remove(newsChannel);
    }

    public void newsUpdate(News news){
        newsList.add(news);
        newsSubscribers.forEach(subs->subs.newsUpdate(news));
    }

}
