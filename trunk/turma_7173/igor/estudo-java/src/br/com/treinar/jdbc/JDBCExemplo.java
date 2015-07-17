package br.com.treinar.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExemplo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conexao =  DriverManager.getConnection("jdbc:mysql://localhost/treinar","root","");
		System.out.println("Conectado!");
		conexao.close();
	}
	
}
