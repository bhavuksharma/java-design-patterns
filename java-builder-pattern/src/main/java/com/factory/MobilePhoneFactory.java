package com.factory;

public class MobilePhoneFactory {

    public IMobilePhone getMobilePhone(String type){
        if("stable".equalsIgnoreCase(type))
            return new IOSPhone();
        else if ("unique".equalsIgnoreCase(type))
            return new WindowsPhone();
        else
            return new AndroidPhone();
    }
}
