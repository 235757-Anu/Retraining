package org.example.Controller;

import org.example.Model.Book;
import org.example.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("")
    public ResponseEntity<Book> create(@RequestBody Book book){
        return ResponseEntity.status(HttpStatus.CREATED).body(bookService.save(book));
    }
    @GetMapping("books")
    public ResponseEntity<List<Book>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(bookService.findAll());
    }
    @GetMapping("/{language}")
    public ResponseEntity<List<Book>> findBookByLanguage(@PathVariable String language) {
//        if(language==null){
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//        }
        return ResponseEntity.status(HttpStatus.OK).body(bookService.findAllByLanguage(language));
    }
}
