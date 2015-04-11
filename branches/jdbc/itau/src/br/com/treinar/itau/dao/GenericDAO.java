package br.com.treinar.itau.dao;

import java.util.List;

import br.com.treinar.itau.exception.BBException;

public abstract class GenericDAO<T, ID> {

	public abstract T gravar(T entity) throws BBException, Exception;

	public abstract T recuperar(ID id) throws BBException, Exception;
	
	public abstract void remover(ID id) throws BBException, Exception;
	
	public abstract void editar(T entity) throws BBException, Exception;
	
	public abstract void excluir(ID id) throws BBException, Exception;
	
	public abstract List<T> recuperarTodos() throws BBException, Exception;
	
}
