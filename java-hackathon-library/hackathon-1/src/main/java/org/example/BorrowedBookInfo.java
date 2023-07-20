package org.example;

import java.time.LocalDate;

public class BorrowedBookInfo
{
    private LocalDate borrowedDate;
    private LocalDate dueDate;
    private Book book;

    public LocalDate getBorrowedDate() {
        return borrowedDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBorrowedDate(LocalDate borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public BorrowedBookInfo(LocalDate borrowedDate, LocalDate dueDate, Book book) {
        this.borrowedDate = borrowedDate;
        this.dueDate = dueDate;
        this.book = book;
    }
}
