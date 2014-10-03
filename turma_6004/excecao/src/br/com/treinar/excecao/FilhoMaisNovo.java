package br.com.treinar.excecao;

import java.io.File;
import java.io.IOException;

public class FilhoMaisNovo {

	private String nome;
	private Filho filho;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void buscarPao() throws NaoTemPaoException {
		System.out.println("estou indo buscar o pão");
		if (true) {
			NaoTemPaoException naoTemPaoException = new NaoTemPaoException();
			throw naoTemPaoException;
		}
	}

	public Filho getFilho() {
		return filho;
	}

	public void setFilho(Filho filho) {
		this.filho = filho;
	}
	
}
