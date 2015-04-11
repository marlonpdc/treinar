package br.com.treinar.itau.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.com.treinar.itau.exception.ItauException;
import br.com.treinar.itau.modelo.principal.Conta;

public class ContaDAO extends GenericDAO<Conta, Long> {

	public ContaDAO(Connection connection) {
		super(connection);
	}
	
	@Override
	public Conta gravar(Conta entity) throws ItauException, Exception {
		String sql = "insert into conta (id_pessoa, numeroConta, saldo) values (?, ?, ?)";
		PreparedStatement stmt = null;
		try {
			//connexao.setAutoCommit(Boolean.FALSE);;
			stmt = getConnection().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			stmt.setLong(1, entity.getPessoa().getId());
			stmt.setInt(2, entity.getNumeroConta());
			stmt.setDouble(3, entity.recuperarSaldo());
			stmt.execute();
			// recupera chave do objeto
			ResultSet rs = stmt.getGeneratedKeys();
			if(rs.next()) {
				entity.setId(Long.valueOf(rs.getInt(1)));
			}
			stmt.close();
			return entity;
		} catch (SQLException e) {
			throw new ItauException(e);
		}
	}

	@Override
	public Conta recuperar(Long id) throws ItauException, Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(Long id) throws ItauException, Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editar(Conta entity) throws ItauException, Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Long id) throws ItauException, Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Conta> recuperarTodos() throws ItauException, Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
