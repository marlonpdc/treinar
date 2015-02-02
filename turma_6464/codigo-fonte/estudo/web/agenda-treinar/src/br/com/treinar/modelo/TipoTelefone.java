package br.com.treinar.modelo;

public enum TipoTelefone {

	COMERCIAL("Comercial"),
	PESSOAL("Pessoal"),
	RESIDENCIAL("Residencial");
	
	private String descricao;
	
	private TipoTelefone(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
}
