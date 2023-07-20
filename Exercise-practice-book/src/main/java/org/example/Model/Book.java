package org.example.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Books")
public class Book {
    @Id
    @GeneratedValue
    private int bookId;
    private String bookName;
    private String language;
    private float price;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public Book(){

    }

    public Book(int bookId, String bookName, String language, float price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.language = language;
        this.price = price;
    }
}
