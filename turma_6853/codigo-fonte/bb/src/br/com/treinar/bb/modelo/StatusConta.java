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
	
	public static StatusConta recuperarPorOrdinal(Integer ordinal) {
		try {
			return StatusConta.values()[ordinal];
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new IllegalArgumentException();
		}
	}
	
}
