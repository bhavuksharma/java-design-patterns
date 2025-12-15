package com.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private String title;
    private List<Subscriber> subscribers = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(List<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }

    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void upload(String title){
        this.title = title;
        for(Subscriber subscriber : subscribers){
            subscriber.update();
        }
    }
}
