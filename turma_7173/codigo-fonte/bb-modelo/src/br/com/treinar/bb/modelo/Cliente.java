package br.com.treinar.bb.modelo;

public class Cliente {

	private Long codigo;
	private String nome;
	private Long cpf;

	public Cliente(String nome, long cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

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

	@Override
	public String toString() {
		return " Cliente [codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf
				+ "]";
	}
	

}
