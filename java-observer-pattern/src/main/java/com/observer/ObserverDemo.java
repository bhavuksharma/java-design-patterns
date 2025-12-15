package com.observer;

public class ObserverDemo {

    static void main(String[] args){
        Channel ch = new Channel();

        Subscriber s1 = new Subscriber("user1");
        Subscriber s2 = new Subscriber("user2");
        Subscriber s3 = new Subscriber("user3");
        Subscriber s4 = new Subscriber("user4");
        Subscriber s5 = new Subscriber("user5");

        ch.addSubscriber(s1);
        ch.addSubscriber(s2);
        ch.addSubscriber(s3);
        ch.addSubscriber(s4);
        ch.addSubscriber(s5);


        ch.removeSubscriber(s4);

        ch.upload("Let's learn Java");

    }
}
