package br.com.quartetoalegreto.orcamento;

import java.util.List;

public class Musico {

	private String nome;
	private List<Telefone> telefone;
	private String email;
	private List<InstrumentoMusical> instrumentos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Telefone> getTelefone() {
		return telefone;
	}
	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<InstrumentoMusical> getInstrumentos() {
		return instrumentos;
	}
	public void setInstrumentos(List<InstrumentoMusical> instrumentos) {
		this.instrumentos = instrumentos;
	}
}
