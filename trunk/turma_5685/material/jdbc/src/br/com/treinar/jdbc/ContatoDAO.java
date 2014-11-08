package br.com.treinar.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ContatoDAO {

	// a conexão com o banco de dados
	private Connection connection;

	public ContatoDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adicionar(Contato contato) {
		String sql = "insert into contatos " +
				"(nome, email, endereco, dataNascimento)" +
				" values (?,?,?,?)";

		try {
			// prepared statement para inserção
			PreparedStatement stmt = connection.prepareStatement(sql);

			// seta os valores

			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTime()));

			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	public void atualizar(Contato contato) {
		String sql = "update contatos set nome=?, email=?, endereco=?," +
				"dataNascimento=? where id=?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTime()));
			stmt.setLong(5, contato.getId());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remover(Contato contato) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete " +
					"from contatos where id=?");
			stmt.setLong(1, contato.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Contato> selecionarContatos() {
		PreparedStatement stmt;
		ResultSet rs;
		List<Contato> contatos = null;
		try {
			stmt = this.connection
					.prepareStatement("select * from contatos");
			rs = stmt.executeQuery();
			contatos = new ArrayList<Contato>();
			Contato contato = null;
			while (rs.next()) {

				// criando o objeto Contato
				contato = new Contato();
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));

				// montando a data através do Calendar
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				contato.setDataNascimento(data.getTime());

				// adicionando o objeto à lista
				contatos.add(contato);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return contatos;
	}

}
