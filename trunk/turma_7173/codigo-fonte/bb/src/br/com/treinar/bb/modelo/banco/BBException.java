package br.com.treinar.bb.modelo.banco;

public class BBException extends Exception {

	private static final long serialVersionUID = 1L;

	private String codigoErroNegocio;

	public String getCodigoErroNegocio() {
		return codigoErroNegocio;
	}

	public void setCodigoErroNegocio(String codigoErroNegocio) {
		this.codigoErroNegocio = codigoErroNegocio;
	}

}
