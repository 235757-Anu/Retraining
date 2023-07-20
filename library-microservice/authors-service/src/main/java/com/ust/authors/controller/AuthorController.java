package com.ust.authors.controller;

import com.ust.authors.domain.Author;
import com.ust.authors.domain.Book;
import com.ust.authors.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    AuthorService authorService;
    RestTemplate restTemplate;
    public AuthorController(RestTemplate restTemplate){
        this.restTemplate=restTemplate;
    }
    private List<Author> authors = new ArrayList<Author>();

    // POST /authors
    @PostMapping
    public ResponseEntity<Author> createAuthor(Author author){
        return ResponseEntity.ok(authorService.createAuthor(authors,author));
    }

    // GET  /authors/{name}
    @GetMapping("/{name}")
    public ResponseEntity<Author> getByName(@PathVariable String name){
        return ResponseEntity.ok(
                authors.stream().filter(author -> author.getName().equals(name)).findFirst().orElseThrow()
        );
    }

    // GET  /authors/{name}/books
    @GetMapping("/{name}/books")
    public ResponseEntity<List<Book>> getBooksByAuthor(@PathVariable String name){
        ResponseEntity<Book[]> response = restTemplate.getForEntity("http://localhost:8100/books/books/{author}",Book[].class,name);
        if (response.getStatusCode() == HttpStatus.OK) {
            return ResponseEntity.ok(Arrays.stream(response.getBody()).toList());
        }
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
