package br.com.treinar.humberto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		@SuppressWarnings("unused")
		Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/banco_de_dados","root","");
		System.out.println("Conectado!");
	}
	

}
