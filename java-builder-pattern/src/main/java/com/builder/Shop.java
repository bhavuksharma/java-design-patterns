package com.builder;

public class Shop {
    public static void main(String[] args){
//        Phone p = new Phone(4,"ios", 0,5.9, "a17",4000);
        Phone p = new PhoneBuilder()
                .setOs("ios26")
                .setStorage(128)
                .setBattery(5000)
                .build();
        System.out.println(p);
    }
}
