package br.com.agenda.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Telefone {

	@Id
	private Long id;
	
	private Integer ddd;
	private Integer numero;
	private TipoTelefone tipo;
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
	public TipoTelefone getTipo() {
		return tipo;
	}
	public void setTipo(TipoTelefone tipo) {
		this.tipo = tipo;
	}
	
}
