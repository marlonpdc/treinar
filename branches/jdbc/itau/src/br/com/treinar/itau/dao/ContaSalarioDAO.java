package br.com.treinar.itau.dao;

import java.sql.Connection;
import java.util.List;

import br.com.treinar.itau.modelo.ContaSalario;

public class ContaSalarioDAO extends GenericDAO<ContaSalario, Long> {

	public ContaSalarioDAO(Connection connection) {
		super(connection);
	}
	
	@Override
	public ContaSalario recuperar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContaSalario gravar(ContaSalario entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void remover(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editar(ContaSalario entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ContaSalario> recuperarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
