package com.factory;

public class IOSPhone implements IMobilePhone{
    @Override
    public void click() {
        System.out.println("I am an IPhone, I provide stable software experience");
    }
}
