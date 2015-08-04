package br.com.treinar.agenda;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@NamedQueries({ 
	@NamedQuery(name = "contatosPorNome", 
			query = "select c from Contato c where c.pessoa.nome like :nome" ),
	@NamedQuery(name = "contatos", 
			query = "select c from Contato c " )
	}
)
@Entity
public class Contato implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro;

	@JoinColumn(name = "pessoa")
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Pessoa pessoa;

	@OneToMany(mappedBy = "contato", fetch=FetchType.EAGER, 
				cascade=CascadeType.ALL)
	private List<ContatoTelefone> telefones;

	private String comentario;

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<ContatoTelefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<ContatoTelefone> telefones) {
		this.telefones = telefones;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

}
