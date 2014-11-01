package br.com.treinar.enumerators;

public enum StatusConta {

	ATIVO("Ativa"),
	INATIVO("Inativa");
	
	private String descricao;
	
	private StatusConta(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public StatusConta getByOrdinal(Integer ordinal) {
		try {
			return values()[ordinal];
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new IllegalArgumentException(e);
		}
	}
	
	public StatusConta getByDescription(String description) {
		for (StatusConta conta : values()) {
			if (conta.descricao.equals(description)) {
				return conta;
			}
		}
		throw new IllegalArgumentException(description);
	}
}
