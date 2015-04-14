package br.com.treinar.bb.modelo;

public class Cliente {

	private static Long indexador;
	
	static {
		indexador = 1l;
	}
	
	public Cliente() {
		id = new Long(indexador++);
	}
	
	private Long id;
	private String nome;
	private Long cpf;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
		return nome;
	}
	
}
