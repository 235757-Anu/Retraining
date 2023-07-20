package com.ust.authors.service;

import com.ust.authors.domain.Author;
import com.ust.authors.domain.Book;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service
public class AuthorServiceImpl implements AuthorService {
//    private RestTemplate restTemplate;
//    public AuthorServiceImpl(RestTemplate restTemplate){
//        this.restTemplate=restTemplate;
//    }
    @Override
    public List<Book> findBooksByAuthor(String author)
    {
        return null;
    }

    @Override
    public Author createAuthor(List<Author> authors, Author author) {
        authors.add(author);
        return author;
    }
}
