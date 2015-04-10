package br.com.treinar.bb.dao;

import java.util.List;

public abstract class GenericDAO<T, ID> {
	
	public abstract T recuperar(ID id);
	
	public abstract void inserir(T objeto);
	
	public abstract void editar(T objeto);
	
	public abstract void excluir(T id);
	
	public abstract List<T> recuperarTodos();
	
}
