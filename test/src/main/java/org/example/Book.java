package org.example;

import java.beans.Statement;

public class Book {
    String name;
    String author;
    int price;
    int quantity;
    String isbn;
    String publisher;
    String category;
    String description;
    String publishedDate;
    String publishedBy;

    Book(String name, String author, int price, int quantity, String isbn, String publisher, String category, String description) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
        this.isbn = isbn;
        this.publisher = publisher;
        this.category = category;
        this.description = description;
        this.publishedDate = publishedDate;
        this.publishedBy = publishedBy;
        IO.println("添加成功");
    }

    void UpdateDescribing (){
        String des;
        des = System.in.toString();
        IO.println("修改描述成功，修改后的描述为："+des);
    }
}

