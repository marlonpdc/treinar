package br.com.agenda.modelo;

public enum TipoTelefone {

	CELULAR("Celular"),
	RESIDENCIAL("Residencial"),
	COMERCIAL("Comercial");
	
	private TipoTelefone(String descricao) {
		this.descricao = descricao;
	}
	
	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}
	
}
