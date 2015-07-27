package br.com.treinar.agenda.exceptions;

public class AgendaException extends Exception {

	private static final long serialVersionUID = 1L;

	private String chave;

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

}
