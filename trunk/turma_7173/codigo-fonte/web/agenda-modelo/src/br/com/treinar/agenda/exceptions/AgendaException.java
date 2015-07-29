package br.com.treinar.agenda.exceptions;

public class AgendaException extends Exception {

	private static final long serialVersionUID = 1L;

	private String chave;
	
	private String page;

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

}
