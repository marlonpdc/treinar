package br.com.treinar.itau.dao;

import java.sql.Connection;
import java.util.List;

import br.com.treinar.itau.exception.ItauException;

public abstract class GenericDAO<T, ID> {
	
	private Connection connection;
	
	public GenericDAO(Connection connection) {
		this.connection = connection;
	}

	public abstract T gravar(T entity) throws ItauException, Exception;

	public abstract T recuperar(ID id) throws ItauException, Exception;
	
	public abstract void remover(ID id) throws ItauException, Exception;
	
	public abstract void editar(T entity) throws ItauException, Exception;
	
	public abstract void excluir(ID id) throws ItauException, Exception;
	
	public abstract List<T> recuperarTodos() throws ItauException, Exception;

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
}
