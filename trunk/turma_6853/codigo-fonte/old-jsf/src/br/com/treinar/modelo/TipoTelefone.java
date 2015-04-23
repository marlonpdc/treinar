package br.com.treinar.modelo;


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
	
	public TipoTelefone getByOrdinal(Integer ordinal) {
		try {
			return values()[ordinal];
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new IllegalArgumentException(e);
		}
	}
	
	public TipoTelefone getByDescription(String description) {
		for (TipoTelefone conta : values()) {
			if (conta.descricao.equals(description)) {
				return conta;
			}
		}
		throw new IllegalArgumentException(description);
	}
	
}
