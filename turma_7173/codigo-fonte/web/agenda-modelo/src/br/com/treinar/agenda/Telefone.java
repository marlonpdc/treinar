package br.com.treinar.agenda;

import java.io.Serializable;

public class Telefone implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer ddd;
	private Integer numero;
	private TipoTelefone tipoTelefone;

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public TipoTelefone getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(TipoTelefone tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

}
