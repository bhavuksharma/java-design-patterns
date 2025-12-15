package com.prototype;

public class PrototypeDemo {

    static void main(String[] args) {

        BookShop bs = new BookShop();
        bs.loadBooks();

        BookShop bs1 = bs.clone();

        bs.getBooks().remove(2);

        System.out.println(bs);
        System.out.println(bs1);
    }
}
