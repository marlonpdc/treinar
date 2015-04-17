package br.com.treinar.bb.modelo.exception;

public class BBException extends Exception {

	private static final long serialVersionUID = -5299045115292187676L;
	
	private String mensagem;
	private String localRetorno;
	
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getLocalRetorno() {
		return localRetorno;
	}
	public void setLocalRetorno(String localRetorno) {
		this.localRetorno = localRetorno;
	}
	
	
	
	
}
