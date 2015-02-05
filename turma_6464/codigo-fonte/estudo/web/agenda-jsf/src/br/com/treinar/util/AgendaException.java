package br.com.treinar.util;

public class AgendaException extends Exception {

	private static final long serialVersionUID = 8479570418672205627L;

	private String descricao;
	
	public AgendaException(String descricao) {
		super(descricao);
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
