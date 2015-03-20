package br.com.quartetoalegreto.orcamento;

public enum TipoEvento {

	CASAMENTO("Casamento"),
	RECEPTIVO("Receptivo"),
	APRESENTACAO("Apresentação");
	
	private String descricao;
	
	private TipoEvento(String descricao) {
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
