package org.example.dao.Book;

import org.example.dao.Author.AuthorDao;
import org.example.dao.DbConnection;
import org.example.dto.Author;
import org.example.dto.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class BookDaoImpl implements BookDao
{

    private  final String INSERT_QUERY="""
            INSERT INTO AUTHORS
                    (AUTHOR_ID,AUTHOR_NAME,GENDER,AUTHOR_EMAIL,JOIN_DATE
                    VALUES(?,?,?,?))""";

    private static final String READ_BY_ID = "SELECT * FROM BOOKS WHERE BOOK_ID = ?";
    private static final String UPDATE_QUERY = " UPDATE BOOKS " +
            " SET BOOK_TITLE = ?, AUTHOR_ID = ? " +
            " WHERE BOOK_ID = ? ";
    private static final String DELETE_QUERY = " DELETE FROM BOOKS WHERE BOOK_ID = ? ";
    private  static final String GET_AUTHOR_DETAILS = "";

    @Override
    public int update(Book object) {
        int update = 0;
        try(Connection connection = DbConnection.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY);
            preparedStatement.setString(1,object.getTitle());
            preparedStatement.setInt(2,object.getAuthorId());
            preparedStatement.setInt(3,object.getBookId());
            update=preparedStatement.executeUpdate();
            preparedStatement.close();
        }catch (SQLException e){
            System.err.println(e);
        }
        return update;
    }

    @Override
    public int delete(Integer id) {
        int update = 0;
        try(Connection connection = DbConnection.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY);
            preparedStatement.setInt(1,id);
            update=preparedStatement.executeUpdate();
            preparedStatement.close();
        }catch(SQLException e){
            System.err.println(e);
        }
        return update;
    }

    @Override
    public int create(Book object) {
        int update = 0;
        try(Connection connection = DbConnection.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY);
            preparedStatement.setInt(1,object.getBookId());
            preparedStatement.setString(2,object.getTitle());
            preparedStatement.setInt(3,object.getAuthorId());
            update=preparedStatement.executeUpdate();
            preparedStatement.close();
        }catch(SQLException e){
            System.err.println(e);
        }
        return update;
    }

    @Override
    public Optional<Book> read(Integer id) {
        Book book = new Book();
        try (Connection connection = DbConnection.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(READ_BY_ID);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                book.setBookId(resultSet.getInt(1));
                book.setTitle(resultSet.getString(2));
                book.setAuthorId(resultSet.getInt(3));
            }
        }catch (SQLException e){
            System.err.println(e);
        }
        return Optional.ofNullable(book);
    }

    @Override
    public Optional<Author> getAuthorDetails(Integer bookId) {

        return Optional.empty();
    }


}
