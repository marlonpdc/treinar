package br.com.treinar.itau.dao;

import java.sql.Connection;
import java.util.List;

import br.com.treinar.itau.modelo.ContaPoupanca;

public class ContaPoupancaDAO extends GenericDAO<ContaPoupanca, Long> {

	public ContaPoupancaDAO(Connection connection) {
		super(connection);
	}
	
	@Override
	public ContaPoupanca recuperar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContaPoupanca gravar(ContaPoupanca entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void remover(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editar(ContaPoupanca entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ContaPoupanca> recuperarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
