package br.com.treinar.estudo.coisas;

public class Pessoa {
	
	public String nome;
	public int idade;
	
	public Pessoa(){
		System.out.println("");
	}
	
	public Pessoa(String nome){
		this.nome = nome;
	}	

	public Pessoa(int idade){
		this.idade = idade;
	}

	public Pessoa(String nome, int idade) {
		this(nome);
		this.idade = idade;
		System.out.println(this.calcularIdadeEmDias());
	}
	
	int calcularIdadeEmDias(){
		return idade * 365; 
	}

	@Override
	public String toString() {
		return "Pessoa nome = " + nome + ", idade = " + idade + "";
	}
	
	
}
