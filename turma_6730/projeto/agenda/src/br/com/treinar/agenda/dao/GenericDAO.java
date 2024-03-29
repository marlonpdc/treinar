package br.com.treinar.agenda.dao;

import java.io.Serializable;
import java.util.List;

import br.com.treinar.agenda.util.AgendaException;

public interface GenericDAO<T, ID> extends Serializable {

	void inserir(T o) throws AgendaException;
	
	Integer remover(T o) throws AgendaException;
	
	T recuperar(ID id) throws AgendaException;
	
	List<T> recuperarTodos() throws AgendaException;

	Integer editar(T o) throws AgendaException;
	
}
