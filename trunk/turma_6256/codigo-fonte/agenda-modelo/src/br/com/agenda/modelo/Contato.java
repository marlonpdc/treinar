package br.com.agenda.modelo;

public class Contato {

	private Pessoa pessoa;
	private String email;
	private Telefone telefone;
	private static Long index;
	private Long id;
	
	static {
		index = 0l;
	}
	
	public Contato() {
		id = ++index;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
