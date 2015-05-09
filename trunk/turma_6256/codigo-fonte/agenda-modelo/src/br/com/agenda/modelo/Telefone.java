package br.com.agenda.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="TB_TELEFONE")
public class Telefone {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="DDD")
	private Integer ddd;
	
	
	private Integer numero;
	
	@Column(length=12)
	@Enumerated(EnumType.STRING)
	private TipoTelefone tipo;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Contato contato;
	
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
