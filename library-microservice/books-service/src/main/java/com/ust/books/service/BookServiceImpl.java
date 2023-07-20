package com.ust.books.service;

import com.ust.books.domain.Author;
import com.ust.books.domain.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements  BookService{
    @Override
    public Optional<Author> findAuthorByName(String author) {
        return null;
    }

    @Override
    public Book createBook(List<Book> books, Book book) {
        books.add(book);
        return book;
    }
}
