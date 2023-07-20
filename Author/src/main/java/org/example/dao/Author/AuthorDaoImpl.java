package org.example.dao.Author;

import org.example.dao.DbConnection;
import org.example.dto.Author;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AuthorDaoImpl implements AuthorDao {

    private  final String INSERT_QUERY= """
            INSERT INTO AUTHORS
                                (AUTHOR_ID,AUTHOR_NAME,GENDER,AUTHOR_EMAIL,JOIN_DATE)
                                VALUES(?,?,?,?,?)""";

    private final String READ_BY_ID=
            "SELECT * FROM AUTHORS WHERE AUTHOR_ID=?";
    private final String READ_ALL=
            "SELECT * FROM AUTHORS";
    private  final String UPDATE_QUERY= """ 
                    UPDATE_AUTHORS
                    SET AUTHOR_NAME=?,AUTHOR_EMAIL=?,GENDER=?,
                    JOIN_DATE=? WHERE AUTHOR_ID=?""";

    private final String DELETE_QUERY=
            "DELETE FROM AUTHORS WHERE AUTHOR_ID=?";
    @Override
    public Optional<Author> read(int authorId) {
        Author author=null;
        try (Connection connection = DbConnection.getConnection();
             PreparedStatement prepareStatement = connection.prepareStatement(READ_BY_ID)
        ) {

            prepareStatement.setInt(1, authorId);
            ResultSet resultSet = prepareStatement.executeQuery();
            if (resultSet.next()) {
                author = new Author();
                author.setAuthorId(resultSet.getInt(1));
                author.setAuthorName(resultSet.getString(2));
                author.setGender(resultSet.getString(3));
                author.setAuthorEmail(resultSet.getString(4));
                author.setJoinDate(resultSet.getDate(5).toLocalDate());
            }

        } catch (SQLException e) {
            System.err.println("Error while connecting to database");
            System.err.println(e.getMessage());
        }
        return Optional.ofNullable(author);

    }

    @Override
    public int create(Author author) {
        int updated = 0;
        try (Connection connection = DbConnection.getConnection();
             PreparedStatement prepareStatement = connection.prepareStatement(INSERT_QUERY)) {
            connection.setAutoCommit(false);

            prepareStatement.setInt(1, author.getAuthorId());
            prepareStatement.setString(2, author.getAuthorName());
            prepareStatement.setString(3, author.getGender());
            prepareStatement.setString(4, author.getAuthorEmail());
            prepareStatement.setDate(5, Date.valueOf(author.getJoinDate()));
            updated = prepareStatement.executeUpdate();

            connection.commit();

        } catch (SQLException e) {
            System.err.println("Error while connecting to database");
            System.err.println(e.getMessage());
        }
        return updated;

    }

    @Override
    public int delete(int AuthorId) {
        return 0;
    }

    @Override
    public int update(Author author) {
        return 0;
    }
    @Override
    public List<Author> readAll()
    {
        List<Author> authors = new ArrayList();
        try (Connection connection = DbConnection.getConnection();
             PreparedStatement prepareStatement = connection.prepareStatement(READ_ALL)) {

            ResultSet resultSet = prepareStatement.executeQuery();
            while (resultSet.next()) {
                Author author = new Author();
                author.setAuthorId(resultSet.getInt(1));
                author.setAuthorName(resultSet.getString(2));
                author.setGender(resultSet.getString(3));
                author.setAuthorEmail(resultSet.getString(4));
                author.setJoinDate(resultSet.getDate(5).toLocalDate());
                authors.add(author);
            }
            prepareStatement.close();
        } catch (SQLException e) {
            System.err.println("Error while connecting to database");
            System.err.println(e.getMessage());
        }
        return authors;

    }
}
