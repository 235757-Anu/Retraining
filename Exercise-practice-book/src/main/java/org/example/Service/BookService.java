package org.example.Service;

import org.example.Model.Book;
import org.example.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book save(Book book){
        return bookRepository.save(book);
    }
    public List<Book> findAll(){
        return bookRepository.findAll();
    }
    public List<Book> findAllByLanguage(String language){
        return bookRepository.findAllByLanguage(language);
    }

}
