package org.example.controller;

import org.example.domain.Author;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/authors")
public class AuthorController {

    private List<Author> authors=List.of(
            new Author("Einstein","eistein@gmail.com","friction"),
            new Author("Albert","albert@gmail.com","frction"),
            new Author("Issac","issac@Gail.com","friction"));
    @GetMapping
    public List<Author> getAuthors(){
        return authors;
    }
    @PostMapping("")
    public Author createAuthors(Author author){
        authors.add(author);
        return author;
    }
}
