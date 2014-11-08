package br.com.treinar.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws SQLException {
		Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/contato", "root", "");
		System.out.println("Conectado!");
		
		String email = "gleidson.gmoura@gmail.com";
		String nome = "Gleidson Guimarães Moura";
		Date dataNascimento = new Date(System.currentTimeMillis());
		String endereco = "rua da paz, 202";
		
		String sql = "insert into contatos " +
		        "(nome, email, endereco, dataNascimento)" +
		        " values ('" + nome + "', '" + email + "', '" + 
		        endereco + "', '"+ dataNascimento +"')";
		
		Statement stmt = conexao.createStatement();
		stmt.executeUpdate(sql);
		stmt.close();
		conexao.close();
	}
	
}
