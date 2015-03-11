package br.com.treinar.estudo.exception;

public class SemDinheirException extends Exception {

	private static final long serialVersionUID = -3891458639976546918L;

	private String descricao;

	public SemDinheirException(String mensagem) {
		super(mensagem);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
