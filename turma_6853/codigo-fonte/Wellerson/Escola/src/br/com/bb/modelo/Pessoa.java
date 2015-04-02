package br.com.bb.modelo;

import java.util.List;


public class Pessoa extends BaseEntity<Long> {

	private String nome;
	private String endereco;
	private String numtelefone;
	private Integer idade;
	private List<PessoaComportamento> comportamento;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumtelefone() {
		return numtelefone;
	}
	public void setNumtelefone(String numtelefone) {
		this.numtelefone = numtelefone;
	}

	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public List<PessoaComportamento> getComportamento() {
		return comportamento;
	}
	public void setComportamento(List<PessoaComportamento> comportamento) {
		this.comportamento = comportamento;
	}
	
	
}
