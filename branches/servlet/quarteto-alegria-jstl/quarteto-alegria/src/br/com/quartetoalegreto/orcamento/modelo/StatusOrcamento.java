package br.com.quartetoalegreto.orcamento.modelo;

public enum StatusOrcamento {

	REGISTRADO("Registrado"),
	APROVADO("Aprovado"),
	REALIZADO("Realizado"),
	RECUSADO("Recusado"),
	CANCELADO("Cancelado");
	
	private String descricao;
	
	private StatusOrcamento(String descricao) {
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
