package br.com.treinar.jdbc.dao;

import br.com.treinar.jdbc.modelo.Contato;
import br.com.treinar.jdbc.modelo.IBaseEntity;

public interface IBaseDAO<T extends IBaseEntity<?>> {

	void inserir(T contato);
	
	Contato recuperar(Long id);
	
	void remover(Long idContato);
	
	void editar(T contato);
	
}
