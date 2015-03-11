package br.com.treinar.humberto;

public class NaoTemPaoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5829949016713636833L;

	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
