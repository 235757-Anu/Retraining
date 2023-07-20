package com.ust.books.controller;

import com.ust.books.domain.Book;
import com.ust.books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookService;

    private List<Book> books = new ArrayList<Book>();

    @GetMapping("/{title}")
    public ResponseEntity<Book> findBookByTitle(@PathVariable String title){
        return ResponseEntity.ok(
                books.stream().filter(book -> book.getTitle().equals(title)).findFirst().orElseThrow());
    }
    @PostMapping
    public ResponseEntity<Book> createBook(Book book)
    {
        return ResponseEntity.ok(bookService.createBook(books,book));
    }
}
