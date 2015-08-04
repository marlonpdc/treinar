package br.com.treinar.agenda.dao;

import java.util.List;

public abstract class GenericDAO<T> {

	public abstract T recuperar(Long id);
	
	public abstract List<T> recuperarTodos();
	
	public abstract void remover(T object);
	
}
