package br.com.treinar.itau.modelo.principal;

public class Pessoa extends BaseEntity<Long> {

	private static final long serialVersionUID = -5028864192443665995L;
	
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
	
}
