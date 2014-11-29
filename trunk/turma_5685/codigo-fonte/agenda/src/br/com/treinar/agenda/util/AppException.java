package br.com.treinar.agenda.util;

public class AppException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private String causa;

	public String getCausa() {
		return causa;
	}

	public void setCausa(String causa) {
		this.causa = causa;
	}
	
}
