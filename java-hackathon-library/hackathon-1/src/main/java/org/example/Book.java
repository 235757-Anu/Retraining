package org.example;

public class Book
{
    private int bookIsbnNumber;
    private String author;
    private String publisher;

    public int getBookIsbnNumber() {
        return bookIsbnNumber;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setBookIsbnNumber(int bookIsbnNumber) {
        this.bookIsbnNumber = bookIsbnNumber;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Book(int bookIsbnNumber, String author, String publisher) {
        this.bookIsbnNumber = bookIsbnNumber;
        this.author = author;
        this.publisher = publisher;
    }
}
