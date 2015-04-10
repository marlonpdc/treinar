package estudo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexao {

	public static void main(String[] args) throws Exception {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/preto", "root", "");
		System.out.println(conn);
	}
	
}
