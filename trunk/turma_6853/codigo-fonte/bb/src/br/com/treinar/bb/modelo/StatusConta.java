package br.com.treinar.bb.modelo;


public enum StatusConta {

	ATIVA("Ativa"),
	INATIVA("Inativa"),
	BLOQUEADA("Bloqueada"),
	CANCELADA("Cancelada");
	
	private String descricao;
	
	private StatusConta(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
