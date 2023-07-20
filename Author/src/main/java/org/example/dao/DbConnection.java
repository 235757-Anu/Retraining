package org.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;

public class DbConnection
{
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/test";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "Welcome@123";

    private DbConnection(){}

    public static Connection getConnection() throws SQLException {
        DriverManager.registerDriver(new Driver());

        return DriverManager.getConnection(URL, USER_NAME, PASSWORD);

    }

}
