package br.com.quartetoalegreto.orcamento;

public enum TipoInstrumento {
	
	CORDA("Corda"),
	SOPRO("Sopro"),
	PERCURSAO("Percursão"),
	VOZ("Voz");
	
	private String descricao;
	
	private TipoInstrumento(String descricao) {
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
