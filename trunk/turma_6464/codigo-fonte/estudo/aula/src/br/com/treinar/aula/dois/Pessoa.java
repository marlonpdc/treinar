package br.com.treinar.aula.dois;

public class Pessoa {

	private String nome;
	private Long cpf;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	
	public Boolean ehIgual(Pessoa outro) {
		/*
		Boolean ehIgual = Boolean.FALSE;
		if (cpf.equals(outro.getCpf())) {
			ehIgual = Boolean.TRUE;
		}
		return ehIgual;*/
		return cpf.equals(outro.getCpf());
	}

	@Override
	public boolean equals(Object outro) {
		Pessoa pessoa = (Pessoa) outro;
		return cpf.equals(pessoa.getCpf());
	}
	
	
	public String apresentarComoTexto() {
		return nome;
	}

	@Override
	public String toString() {
		return nome;
	}

	
}
