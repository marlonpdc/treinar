package br.com.treinar.itau.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.treinar.itau.util.ItauConstante.DatabaseMetainfo;

public class ConnectionFactory {

	public static Connection getConnection() {
        try {
            return DriverManager.getConnection(DatabaseMetainfo.URL_CONEXAO, DatabaseMetainfo.USUARIO, DatabaseMetainfo.SENHA);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
	
}
