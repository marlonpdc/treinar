package br.com.treinar.itau.dao;

import java.sql.Connection;
import java.util.List;

import br.com.treinar.itau.modelo.ContaInvestimento;

public class ContaInvestimentoDAO extends GenericDAO<ContaInvestimento, Long> {

	public ContaInvestimentoDAO(Connection connection) {
		super(connection);
	}
	
	@Override
	public ContaInvestimento recuperar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContaInvestimento gravar(ContaInvestimento entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void remover(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editar(ContaInvestimento entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ContaInvestimento> recuperarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}
