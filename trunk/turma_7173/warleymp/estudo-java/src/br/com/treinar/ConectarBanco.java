package br.com.treinar;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConectarBanco {

	public static void main(String[] args) throws SQLException,
			ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conexao = (Connection) DriverManager.getConnection(
				"jdbc:mysql://localhost/treinar", "root", "");
		System.out.println("Conectado!");
		conexao.close();
	}
}
