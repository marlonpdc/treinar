package br.com.treinar.itau.exception;

public class ItauException extends Exception {

	private static final long serialVersionUID = 689376527024775127L;

	private String causa;

	public ItauException() {
		super();
	}
	
	public ItauException(Throwable cause) {
		super(cause);
	}
	
	public String getCausa() {
		return causa;
	}

	public void setCausa(String causa) {
		this.causa = causa;
	}
	
}
