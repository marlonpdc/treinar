package br.com.pandora.estudo.encapsulamento;

public class Pessoa {
	
	private String nome;
	private String sobrenomne;
	private String apelido;
	private int    idade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenomne() {
		return sobrenomne;
	}
	public void setSobrenomne(String sobrenomne) {
		this.sobrenomne = sobrenomne;
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
	
	
	
}
