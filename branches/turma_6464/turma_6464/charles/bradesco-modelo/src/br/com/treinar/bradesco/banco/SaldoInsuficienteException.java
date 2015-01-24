package br.com.treinar.bradesco.banco;

public class SaldoInsuficienteException extends Exception {

	private static final long serialVersionUID = 4179298613479290393L;

	
	private String causa;


	public String getCausa() {
		return causa;
	}


	public void setCausa(String causa) {
		this.causa = causa;
	}
	
	
	
	
}
