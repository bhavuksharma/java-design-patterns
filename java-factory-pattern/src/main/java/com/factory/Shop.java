package com.factory;

public class Shop {
    public static void main(String[] args){
        MobliePhoneFactory mpf = new MobliePhoneFactory();
        IMobilePhone imp = mpf.getMobilePhone("unique");
        imp.click();
    }
}
