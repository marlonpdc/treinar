package estudo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class JDBCInsere {

	public static void main(String[] args) throws SQLException {

		// conectando
		Connection con = new ConnectionFactory().getConnection();
		//con.setAutoCommit(Boolean.FALSE);
		
		
		Contato c = new Contato();
		c.setNome("Treinar");
		c.setEmail("contato@treinar.com.br");
		c.setEndereco("R. XPTO 3185 cj57");
		c.setDataNascimento(new Date());
		
		// cria um preparedStatement
		String sql = "insert into contato" +
				" (nome, email, endereco, dataNascimento)" +
				" values (? , ?, ?, ?)";
		PreparedStatement stmt = con.prepareStatement(sql);

		// preenche os valores
		stmt.setString(1, c.getNome());
		stmt.setString(2, c.getEmail());
		stmt.setString(3, c.getEndereco());
		stmt.setDate(4, new java.sql.Date(c.getDataNascimento().getTime()));

		// executa
		stmt.execute();
		stmt.close();

		System.out.println("Gravado!");

		con.close();
	}

}
