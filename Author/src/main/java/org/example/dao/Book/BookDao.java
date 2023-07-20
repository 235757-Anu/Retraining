package org.example.dao.Book;

import org.example.dao.GenericDao;
import org.example.dto.Author;
import org.example.dto.Book;

import java.util.Optional;

public interface BookDao extends GenericDao<Book,Integer>
{
    //int create(Book book);
    //Author read(int bookId);
    //int update(Book book);
    //int delete(int bookId);
    Optional<Author> getAuthorDetails(Integer bookId);
}
