package com.observer;

public class Subscriber {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void update(){
        System.out.println("Hey "+ this.name + ", new video uploaded");
    }
}
