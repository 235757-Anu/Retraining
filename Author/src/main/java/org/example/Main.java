package org.example;

import org.example.dao.Author.AuthorDao;
import org.example.dao.Author.AuthorDaoImpl;
import org.example.dto.Author;
import java.util.Optional;
import java.util.List;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args)
    {
        readAll();
    }
    static void readAll(){
        AuthorDao authorDao = new AuthorDaoImpl();
        List<Author> authors = authorDao.readAll();
        if(authors.isEmpty()){
            System.out.println("No authors found");
            return;
        }
        for (Author author : authors) {
            System.out.println(author);
        }
    }

    static void readById() {
        AuthorDao authorDao = new AuthorDaoImpl();
        Optional<Author> optionalAuthor = authorDao.read(10);
        if (optionalAuthor.isEmpty()) {
            System.out.println("Author not found");
            return;
        }
        System.out.println(optionalAuthor.get());
    }

    static void insertData() {
        Author tolkien = new Author(2, "Anu Polly", "Female",
                "polly.polly.com", LocalDate.of(1960, 10, 10));

        System.out.println("Saving author: " + tolkien);

        AuthorDao authorDao = new AuthorDaoImpl();
        int updated = authorDao.create(tolkien);

        System.out.format("%d row(s) updated", updated);

    }

}