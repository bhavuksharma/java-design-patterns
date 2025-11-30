package com.builder;

public class Phone {
    private int ram;
    private String os;
    private int storage;
    private double screenSize;
    private String processor;
    private int battery;

    public Phone(int ram, String os, int storage, double screenSize, String processor, int battery) {
        this.ram = ram;
        this.os = os;
        this.storage = storage;
        this.screenSize = screenSize;
        this.processor = processor;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "ram=" + ram +
                ", os='" + os + '\'' +
                ", storage=" + storage +
                ", screenSize=" + screenSize +
                ", processor='" + processor + '\'' +
                ", battery=" + battery +
                '}';
    }
}
