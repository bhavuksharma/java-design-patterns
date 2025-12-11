package com.pattern;

public class CompositeTest {

    public static void main(String[] args){
        Component ram = new Leaf("Ram", 2000);
        Component hd = new Leaf("HDD", 1000);
        Component mouse = new Leaf("Mouse", 500);
        Component keyboard = new Leaf("Keyboard", 700);
        Component monitor = new Leaf("Monitor", 6000);

        Composite ph = new Composite("Peripheral");
        Composite mb = new Composite("Mother Board");
        Composite cb = new Composite("Cabinet");
        Composite computer = new Composite("Computer");

        ph.addComponent(mouse);
        ph.addComponent(keyboard);
        ph.addComponent(monitor);

        mb.addComponent(ram);

        cb.addComponent(mb);
        cb.addComponent(hd);

        computer.addComponent(ph);
        computer.addComponent(cb);

        computer.showPrice();
    }
}
