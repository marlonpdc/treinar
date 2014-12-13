package br.com.treinar.util;


public enum Acao {

	CRIAR("Criar"),
	EXCLUIR("Excluir"),
	LISTAR("Listar"),
	EDITAR("Editar");
	
	private String descricao;
	
	private Acao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public Acao getByOrdinal(Integer ordinal) {
		try {
			return values()[ordinal];
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new IllegalArgumentException(e);
		}
	}
	
	public Acao getByDescription(String description) {
		for (Acao conta : values()) {
			if (conta.descricao.equals(description)) {
				return conta;
			}
		}
		throw new IllegalArgumentException(description);
	}
	
}
