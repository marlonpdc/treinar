package br.com.treinar.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    public Connection getConnection() {
        try {
        	Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(
          "jdbc:mysql://localhost/treinar", "root", "");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}