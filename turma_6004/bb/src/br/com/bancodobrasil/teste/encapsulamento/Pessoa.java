package br.com.bancodobrasil.teste.encapsulamento;

import java.util.Date;

public class Pessoa {

	private String nome;
	private Date dataNascimento;
	
	public void atribuirDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Date pegarDataNascimento() {
		return dataNascimento;
	}
	public void atribuirNome(String nome) {
		this.nome = nome;
	}
	public String pegarNome() {
		return nome;
	}
}
