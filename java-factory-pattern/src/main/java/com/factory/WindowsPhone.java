package com.factory;

public class WindowsPhone implements IMobilePhone{
    @Override
    public void click() {
        System.out.println("I am a WindowsPhone, I am quite unique");
    }
}
