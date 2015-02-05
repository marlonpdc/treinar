package br.com.treinar.entity;

import java.io.Serializable;

public class Pessoa implements Serializable {

	private static final long serialVersionUID = 5638430561653867348L;
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
