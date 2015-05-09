package br.com.treinar.agenda.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ContatoTelefone implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ContatoTelefonePK id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro;

	public ContatoTelefonePK getId() {
		return id;
	}

	public void setId(ContatoTelefonePK id) {
		this.id = id;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
}
