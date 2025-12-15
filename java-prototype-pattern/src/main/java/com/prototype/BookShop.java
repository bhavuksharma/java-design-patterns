package com.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop {
    private int shopName;
    private List<Book> books = new ArrayList<>();

    public int getShopName() {
        return shopName;
    }

    public void setShopName(int shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadBooks(){
        for(int i = 1 ; i < 10 ; i++){
            Book book = new Book();
            book.setBid(i);
            book.setBname("Book_" + i);
            getBooks().add(book);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName=" + shopName +
                ", books=" + books +
                '}';
    }

    public BookShop clone() {
        BookShop tempShop = new BookShop();
        for(Book book : this.getBooks()){
            tempShop.getBooks().add(book);
        }
        return tempShop;
    }
}
