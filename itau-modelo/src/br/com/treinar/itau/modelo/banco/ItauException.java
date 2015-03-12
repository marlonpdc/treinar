package br.com.treinar.itau.modelo.banco;

public class ItauException extends Exception {

	private static final long serialVersionUID = 8117661148145741845L;
	
	private String mensagem;
	
	public ItauException(String msg) {
		this.mensagem = msg;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
}
