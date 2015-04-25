package br.com.agenda.modelo;

public enum TipoTelefone {

	RESIDENCIAL("Residencial"),
	CELULAR("Celular"),
	COMERCIAL("Comercial");
	
	private TipoTelefone(String descricao) {
		this.descricao = descricao;
	}
	
	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}
	
}
