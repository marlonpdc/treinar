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

/**
 * Classe responsável por manter a entidade Contato
 * @author Gleidson
 * @version -2795495097851130276L
 * @since -1L
 *
 */
public class ContatoDAO implements GenericDAO<Contato, Long> {

	/**
	 * controlador de versão da classe
	 */
	private static final long serialVersionUID = -2795495097851130276L;

	/**
	 * Classe contendo a implementação do JDBC
	 */
	private Connection connection;

	/**
	 * Inseri um Contato na base de dados
	 * 
	 * @param o Contato a ser inserido na base de dados
	 * @throws AgendaException - caso o contato nao possa ser inserido
	 * 		   levanta uma excecao do tipo AgendaExeption ecapsulando a real causa
	 * 		   que pode ser recuperada pelo <code>obj.getCause()</code>
	 */
	@Override
	public void inserir(Contato o) throws AgendaException {
		String sql = "insert into contato "
				+ "(nome, email, endereco, dataNascimento) "
				+ "values (?, ?, ?, ?)";
		try {
			connection = new ConnectionFactory().getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, o.getNome());
			stmt.setString(2, o.getEmail());
			stmt.setString(3, o.getEndereco());
			stmt.setDate(4, new java.sql.Date(o.getDataNascimento().getTime()));

			stmt.execute();
			stmt.close();

		} catch (Exception e) {
			rollBack();
			throw new AgendaException(e);
		} finally {
			close();
		}
	}

	/**
	 * Fecha a conexão com o banco de dados
	 */
	private void close() {
		try {
			connection.close();
		} catch (SQLException e) {
			System.out.println("Erro ao fechar a tarnsacao");
		}
	}

	/**
	 * Desfaz uma transação 
	 */
	private void rollBack() {
		try {
			connection.rollback();
		} catch (SQLException e1) {
			System.out.println("Erro ao desfazer a transacao");
		}
	}


	/**
	 * Método responsável por remover um contato da base de dados
	 * 
	 * @param id identificador unico do contato a ser removido
	 * 
	 * @return A quantidade de regitros afetados pela execucao do comando
	 */
	@Override
	public Integer remover(Contato o) throws AgendaException {
		PreparedStatement stmt = null;
		try {
			connection = new ConnectionFactory().getConnection();
			connection.setAutoCommit(Boolean.FALSE);
			String query = "delete from contato where id = ?";
			stmt = connection.prepareStatement(query);
			stmt.setLong(1, o.getId());
			Integer linhasAfetadas = stmt.executeUpdate();
//			caso aconteca uma excecao a transacao eh desfeita
//			String t = null;
//			t.toCharArray();
			connection.commit();
			stmt.close();
			return linhasAfetadas;
		} catch (Exception e) {
			rollBack();
			throw new AgendaException(e);
		} finally {
			close();
		}
	}

	/**
	 * Método responsável por recuperar um contato da base de dados
	 * 
	 * @param id identificador unico do contato a ser recuperado
	 * 
	 * @return 
	 */
	@Override
	public Contato recuperar(Long id) throws AgendaException {
		try {
			connection = new ConnectionFactory().getConnection();
			PreparedStatement stmt = this.connection
					.prepareStatement("select * from contato where id = ?");
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
		} catch (Exception e) {
			rollBack();
			throw new AgendaException(e);
		} finally {
			close();
		}
	}

	@Override
	public List<Contato> recuperarTodos() throws AgendaException {
		try {
			connection = new ConnectionFactory().getConnection();
			List<Contato> contatos = new ArrayList<Contato>();
			PreparedStatement stmt = this.connection
					.prepareStatement("select * from contato");
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
		} catch (Exception e) {
			throw new AgendaException(e);
		} finally {
			close();
		}
	}

	@Override
	public Integer editar(Contato contato) throws AgendaException {
		String sql = "update contato set nome = ?, "
				+ "email = ?, endereco = ?, dataNascimento = ? "
				+ "where id = ?";
		try {
			connection = new ConnectionFactory().getConnection();
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTime()));
			stmt.setLong(5, contato.getId());
			Integer qtdRegistrosEditados = stmt.executeUpdate();
			stmt.close();
			return qtdRegistrosEditados;
		} catch (Exception e) {
			rollBack();
			throw new AgendaException(e);
		} finally {
			close();
		}
	}

}
// Contato c = dao.recuperar(10);