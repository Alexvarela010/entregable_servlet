package com.example.crud.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDatabase {
    private static final String url = "jdbc:sqlite:C:\\intelui\\crud\\javaee.db";

    private ConnectionDatabase() {}

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return DriverManager.getConnection(url);
    }
}
