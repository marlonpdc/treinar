package br.com.treinar.agenda;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Telefone implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private Integer ddd;
	private Integer numero;
	
	@OneToMany(mappedBy="telefone", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<ContatoTelefone> contatos;
	
	@Enumerated(EnumType.ORDINAL)
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<ContatoTelefone> getContatos() {
		return contatos;
	}

	public void setContatos(List<ContatoTelefone> contatos) {
		this.contatos = contatos;
	}

	@Override
	public String toString() {
		return "Telefone [id=" + id + ", ddd=" + ddd + ", numero=" + numero
				+ ", contatos=" + contatos + ", tipoTelefone=" + tipoTelefone
				+ "]";
	}
	
	


}
