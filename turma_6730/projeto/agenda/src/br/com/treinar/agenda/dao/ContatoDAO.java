package br.com.treinar.agenda.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.util.AgendaException;
import br.com.treinar.agenda.util.ConnectionFactory;

public class ContatoDAO implements GenericDAO<Contato, Long> {

	private Connection connection;

	public ContatoDAO() throws AgendaException {
		connection = new ConnectionFactory().getConnection();
	}

	@Override
	public void inserir(Contato o) throws AgendaException {
		String sql = "insert into contato " +
				"(nome, email, endereco, dataNascimento) " +
				"values (?, ?, ?, ?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, o.getNome());
			stmt.setString(2, o.getEmail());
			stmt.setString(3, o.getEndereco());
			stmt.setDate(4, new java.sql.Date(o.getDataNascimento().getTime()));

			stmt.execute();
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			throw new AgendaException(e);
		}
	}

	@Override
	public Integer remover(Contato o) throws AgendaException {
		PreparedStatement stmt = null;
		try {
			String query = "delete from contato where id = ?";
			stmt = connection.prepareStatement(query);
			stmt.setLong(1, o.getId());
			Integer linhasAfetadas = stmt.executeUpdate();
			stmt.close();
			return linhasAfetadas;
		} catch (Exception e) {
			throw new AgendaException(e);
		}
	}

	@Override
	public Contato recuperar(Long id) throws AgendaException {
		try {
	         PreparedStatement stmt = this.connection.prepareStatement("select * from contato where id = ?");
	         stmt.setLong(1, id);
	         ResultSet rs = stmt.executeQuery();
	         Contato contato = null;
	         if (rs.next()) {
	             // criando o objeto Contato
	             contato = new Contato();
	             contato.setId(rs.getLong("id"));
	             contato.setNome(rs.getString("nome"));
	             contato.setEmail(rs.getString("email"));
	             contato.setEndereco(rs.getString("endereco"));
	 
	             // montando a data através do Calendar
	             Calendar calendar = Calendar.getInstance();
	             calendar.setTime(rs.getDate("dataNascimento"));
	             contato.setDataNascimento(calendar.getTime());
	         } else {
	        	 throw new AgendaException("Contato Não Cadastrado");
	         }
	         rs.close();
	         stmt.close();
	         return contato;
	     } catch (SQLException e) {
	         throw new AgendaException(e);
	     }
	}
	
	@Override
	public List<Contato> recuperarTodos() throws AgendaException {
		try {
	         List<Contato> contatos = new ArrayList<Contato>();
	         PreparedStatement stmt = this.connection.prepareStatement("select * from contato");
	         ResultSet rs = stmt.executeQuery();
	         Contato contato = null;
	         while (rs.next()) {
	             // criando o objeto Contato
	             contato = new Contato();
	             contato.setId(rs.getLong("id"));
	             contato.setNome(rs.getString("nome"));
	             contato.setEmail(rs.getString("email"));
	             contato.setEndereco(rs.getString("endereco"));
	 
	             // montando a data através do Calendar
	             Calendar calendar = Calendar.getInstance();
	             calendar.setTime(rs.getDate("dataNascimento"));
	             contato.setDataNascimento(calendar.getTime());
	 
	             // adicionando o objeto à lista
	             contatos.add(contato);
	         }
	         rs.close();
	         stmt.close();
	         return contatos;
	     } catch (SQLException e) {
	         throw new AgendaException(e);
	     }
	}

	@Override
	public Integer editar(Contato contato) throws AgendaException {
		String sql = "update contato set nome = ?, " + 
					 "email = ?, endereco = ?, dataNascimento = ? " + 
					 "where id = ?";
	     try {
	         PreparedStatement stmt = connection.prepareStatement(sql);
	         stmt.setString(1, contato.getNome());
	         stmt.setString(2, contato.getEmail());
	         stmt.setString(3, contato.getEndereco());
	         stmt.setDate(4, new Date(contato.getDataNascimento().getTime()));
	         stmt.setLong(5, contato.getId());
	         Integer qtdRegistrosEditados = stmt.executeUpdate();
	         stmt.close();
	         return qtdRegistrosEditados;
	     } catch (SQLException e) {
	         throw new AgendaException(e);
	     }
	}

}
//Contato c = dao.recuperar(10);