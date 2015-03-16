package br.com.treinar.agenda.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	public Connection getConnection() throws AgendaException {
        try {
        	Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/treinar", "root", "");
        } catch (Exception e) {
            throw new AgendaException(e);
        }
    }
}
