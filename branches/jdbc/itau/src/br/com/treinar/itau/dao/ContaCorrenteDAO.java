package br.com.treinar.itau.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.com.treinar.itau.exception.ItauException;
import br.com.treinar.itau.modelo.ContaCorrente;

public class ContaCorrenteDAO extends GenericDAO<ContaCorrente, Long> {

	public ContaCorrenteDAO(Connection connection) {
		super(connection);
	}
	
	@Override
	public ContaCorrente recuperar(Long id) {
		
		return null;
	}

	@Override
	public ContaCorrente gravar(ContaCorrente entity) throws ItauException, ItauException {
		String sql = "insert into conta_corrente (id_conta, limiteCredito, tarifa) values (?, ?, ?)";
		PreparedStatement stmt = null;
		try {
			getConnection().setAutoCommit(Boolean.FALSE);
			PessoaDAO daoPessoa = new PessoaDAO(getConnection());
			daoPessoa.gravar(entity.getPessoa());
			
			ContaDAO daoConta = new ContaDAO(getConnection());
			daoConta.gravar(entity);
			
			stmt = getConnection().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			stmt.setLong(1, entity.getId());
			stmt.setDouble(2, entity.getLimiteCredito());
			stmt.setDouble(3, entity.getTarifa());
			stmt.execute();
			// recupera chave do objeto
			ResultSet rs = stmt.getGeneratedKeys();
			if(rs.next()) {
				entity.setId(Long.valueOf(rs.getInt(1)));
			}
			getConnection().commit();
			stmt.close();
			return entity;
		} catch (SQLException e) {
			rollback();
			throw new ItauException(e);
		} catch (Exception e) {
			rollback();
			throw new ItauException(e);
		}
	}

	private void rollback() throws ItauException {
		try {
			getConnection().rollback();
		} catch (SQLException e) {
			throw new ItauException();
		}
	}
	
	
	
	@Override
	public void remover(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editar(ContaCorrente entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ContaCorrente> recuperarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
