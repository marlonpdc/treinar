package br.com.treinar.aula.excecao;

import java.util.Random;

public class Filho {

	private String nome;

	public void tomarBanho() throws Exception {
		boolean tomouBanho = new Random().nextBoolean();
		if (!tomouBanho) {
			throw new Exception();
		}
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
