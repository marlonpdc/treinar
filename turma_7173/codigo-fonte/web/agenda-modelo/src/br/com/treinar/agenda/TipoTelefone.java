package br.com.treinar.agenda;

public enum TipoTelefone {

	RESIDENCIAL("Residencial"),
	CELULAR("Celular"),
	COMERCIAL("Comercial");
	
	private String descricao;
	
	private TipoTelefone(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
