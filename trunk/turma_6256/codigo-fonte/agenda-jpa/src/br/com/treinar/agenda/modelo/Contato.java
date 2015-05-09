package br.com.treinar.agenda.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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

import br.com.treinar.agenda.util.Constant;

@NamedQueries({ 
	@NamedQuery(name = Constant.NamadQueris.FIND_CONTATO_BY_NOME, 
			query = "select c from Contato c where c.pessoa.nome like :nome" )
	}
)
@Entity
public class Contato implements Serializable {

	private static final long serialVersionUID = 1L;

	public Contato() {
		super();
	}
	
	public Contato(String nome, String email) {
		super();
		pessoa = new Pessoa();
		this.pessoa.setNome(nome);
		this.email = email;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@JoinColumn(name="pessoa")
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Pessoa pessoa;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Telefone> telefones;
	
	@Column(name="email", unique=true)
	private String email;
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
