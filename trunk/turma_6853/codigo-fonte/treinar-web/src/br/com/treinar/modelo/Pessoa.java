package br.com.treinar.modelo;

import java.util.List;

public class Pessoa {

	private String nome;
	private Integer idade;
	private String sexo;
	private List<String> desenhoAnimado;
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(String nome, Integer idade, String sexo,
			List<String> desenhoAnimado) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.desenhoAnimado = desenhoAnimado;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public List<String> getDesenhoAnimado() {
		return desenhoAnimado;
	}
	public void setDesenhoAnimado(List<String> desenhoAnimado) {
		this.desenhoAnimado = desenhoAnimado;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo
				+ ", desenhoAnimado=" + desenhoAnimado + "]<br />";
	}
	
	
}
