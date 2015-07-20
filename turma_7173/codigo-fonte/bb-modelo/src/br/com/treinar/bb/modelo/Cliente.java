package br.com.treinar.bb.modelo;

public class Cliente {

	private long codigo;
	private String nome;
	private long cpf;

	public Cliente(String nome, long cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return " Cliente [codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf
				+ "]";
	}
	

}
