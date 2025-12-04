package com.factory;

public class AndroidPhone implements IMobilePhone{
    @Override
    public void click() {
        System.out.println("I am an AndroidPhone, I introduce latest features to the World");
    }
}
