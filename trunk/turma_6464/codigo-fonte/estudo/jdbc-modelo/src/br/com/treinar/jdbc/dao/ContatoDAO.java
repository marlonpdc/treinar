package br.com.treinar.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.treinar.jdbc.modelo.Contato;
import br.com.treinar.jdbc.util.ConnectionFactory;


public class ContatoDAO implements IBaseDAO<Contato> {

	ConnectionFactory factory = new ConnectionFactory();
	
	public void inserir(Contato c) {
		
		Connection conexao = factory.getConnection();
		System.out.println("Conectado!");

		// cria um preparedStatement
		String sql = "insert into contatos (nome, email, endereco, dataNascimento)" +
										  " values (?,?,?,?)";
		PreparedStatement stmt;
		try {
			stmt = conexao.prepareStatement(sql);
			
			// preenche os valores
			stmt.setString(1, c.getNome());
			stmt.setString(2, c.getEmail());
			stmt.setString(3, c.getEndereco());
			stmt.setDate(4, new java.sql.Date(c.getDataNascimento().getTimeInMillis()));
			
			// executa
			stmt.execute();
			stmt.close();
			
			conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Contato recuperar(Long id) {
		return null;
	}
	
	public void remover(Long idContato) {
		
	}
	
	public void editar(Contato contato) {
		
	}
	
	public Contato recuperarPorEmail(String email) {
		return null;
	}
	
}
