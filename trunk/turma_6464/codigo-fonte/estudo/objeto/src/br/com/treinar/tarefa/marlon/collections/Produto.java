package br.com.treinar.tarefa.marlon.collections;

public class Produto {
	private String nome;
	private Double preco;

	public Produto(String nome, Double descricao) {
		super();
		this.nome = nome;
		this.preco = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getDescricao() {
		return preco;
	}

	public void setDescricao(Double descricao) {
		this.preco = descricao;
	}
}
