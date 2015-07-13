package br.com.treinar.bb.modelo;


public enum SituacaoConta {

	ATIVA("Ativa"),
	CANCELADA("Cancelada"),
	BLOQUEADA("Bloqueada");
	
	private String descricao;
	
	private SituacaoConta(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	
	public static SituacaoConta recuperarSituacaoPorOrdinal(Integer ordinalSituacao) {
		
		SituacaoConta[] situacoes = values();
		
		return situacoes[ordinalSituacao];
	}
}
