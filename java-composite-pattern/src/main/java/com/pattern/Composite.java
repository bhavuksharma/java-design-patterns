package com.pattern;

import java.util.ArrayList;

public class Composite implements  Component{
    String name;
    ArrayList<Component> components = new ArrayList<>();

    public Composite(String name){
        this.name = name;
    }

    public void addComponent(Component component){
        this.components.add(component);
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        for(Component component: components){
            component.showPrice();
        }
    }
}
