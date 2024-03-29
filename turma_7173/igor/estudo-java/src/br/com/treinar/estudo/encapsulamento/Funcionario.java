package br.com.treinar.estudo.encapsulamento;

public class Funcionario {

	private String nome;
	private String sobrenome;
	private String apelido;
	private int idade;
	
	public Funcionario(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int calcularDiasFerias(){
		return 0;
	}
	
	public double calcularBonificacao(){
		return 20;
	}
}
