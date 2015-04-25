package br.com.treinar.agenda;

public class AgendaException extends Exception {

	private static final long serialVersionUID = -3096672263308875300L;
	
	private String erro;
	private String destino;
	
	public AgendaException(String erro) {
		this.erro = erro;
	}

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	
	
}
