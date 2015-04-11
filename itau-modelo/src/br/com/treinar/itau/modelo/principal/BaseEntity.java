package br.com.treinar.itau.modelo.principal;

import java.io.Serializable;

public abstract class BaseEntity<ID> implements Serializable {

	private static final long serialVersionUID = -2357670945734812079L;
	
	private ID id;

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}
	
}
