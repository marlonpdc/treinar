package br.com.pandora.atividade;

public class Pessoa {
	String nome;
	String sobrenome;
	String profissao;
	int idade;
	int peso;
	
	void envelhecer(){
		idade ++;
	}
	
	/*Construtor*/
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome,int idade) {
		this.nome = nome;
		this.idade =idade;
	}
}
