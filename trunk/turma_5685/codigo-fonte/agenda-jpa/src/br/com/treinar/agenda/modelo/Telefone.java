package br.com.treinar.agenda.modelo;

public class Telefone {

	private Integer numero;
	private Integer ddd;
	private TipoTelefone tipo;
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getDdd() {
		return ddd;
	}
	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}
	public TipoTelefone getTipo() {
		return tipo;
	}
	public void setTipo(TipoTelefone tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return ddd != null && numero != null ? "(" + ddd + ")" + numero : "";
	}
	
}
