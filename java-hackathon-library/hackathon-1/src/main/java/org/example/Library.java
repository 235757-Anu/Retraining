package org.example;

import java.util.HashSet;
import java.util.Set;
public class Library
{
    private String libraryName;
    private String libraryRegNo;
    private Address address;
    private Set<Book> books = new HashSet<>();
    public String getLibraryName() {
        return libraryName;
    }

    public String getLibraryRegNo() {
        return libraryRegNo;
    }

    public Address getAddress() {
        return address;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public void setLibraryRegNo(String libraryRegNo) {
        this.libraryRegNo = libraryRegNo;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Library(String libraryName, String libraryRegNo, Address address, Set<Book> books) {
        this.libraryName = libraryName;
        this.libraryRegNo = libraryRegNo;
        this.address = address;
        this.books = books;
    }

    void lendBooks()
    {

    }
    void collectDue()
    {

    }
}
