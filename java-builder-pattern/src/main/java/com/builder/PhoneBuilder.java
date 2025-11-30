package com.builder;

public class PhoneBuilder {
    private int ram;
    private String os;
    private int storage;
    private double screenSize;
    private String processor;
    private int battery;

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public Phone build(){
        return new Phone(this.ram,this.os, this.storage, this.screenSize, this.processor, this.battery);
    }
}
