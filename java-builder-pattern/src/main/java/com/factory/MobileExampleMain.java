package com.factory;

public class MobileExampleMain {
    public static void main(String[] args){
        MobilePhoneFactory mpf = new MobilePhoneFactory();
        IMobilePhone imp = mpf.getMobilePhone("unique");
        imp.show();
    }
}
