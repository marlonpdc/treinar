package br.com.treinar.itau.exception;

public class BBException extends Exception {

	private static final long serialVersionUID = 689376527024775127L;

	private String causa;

	public BBException() {
		super();
	}
	
	public BBException(Throwable cause) {
		super(cause);
	}
	
	public String getCausa() {
		return causa;
	}

	public void setCausa(String causa) {
		this.causa = causa;
	}
	
	
	
}
