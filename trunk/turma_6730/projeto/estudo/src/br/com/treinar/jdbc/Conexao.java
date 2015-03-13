package br.com.treinar.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conexao = DriverManager.getConnection(
				"jdbc:mysql://localhost/treinar", "root", "");
		System.out.println("Conectado!");
	}

}
