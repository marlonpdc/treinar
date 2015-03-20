package br.com.quartetoalegreto.orcamento.modelo;

public enum TipoTelefone {

	CELULAR("Celular"),
	COMERCIAL("Comercial"),
	RESIDENCIAL("Residencial");
	
	private String descricao;
	
	private TipoTelefone(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return this.descricao;
	}
	
}
