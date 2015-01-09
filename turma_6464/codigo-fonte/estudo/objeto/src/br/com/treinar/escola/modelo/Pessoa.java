package br.com.treinar.escola.modelo;

import java.util.Date;

public class Pessoa {

	public Pessoa(String nomeDaPessoa, Date dataNascimentoDaPessoa) {
		nome = nomeDaPessoa;
		dataNascimento = dataNascimentoDaPessoa;
	}
	
	public Pessoa(String nomeDaPessoa) {
		nome = nomeDaPessoa;
	}

	public String nome;
	public Date dataNascimento;
	
}
