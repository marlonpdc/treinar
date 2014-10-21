package br.com.treinar.agenda.modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints={@UniqueConstraint(name="constraint_email", columnNames={"email"})})
public class Contato {

	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	
	@Column(name="nome_contato", nullable=false)
	private String nome;
	
	@ManyToOne(cascade=CascadeType.ALL, optional=true)
	@JoinColumn(name="idTelefone", nullable=true)
	private Telefone telefone;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="contato", fetch=FetchType.EAGER, orphanRemoval=true)
	private List<ContatoTelefone> telefones;
	
	@Column(name="endereco")
	private String endereco;
	
	@Column(name="email", nullable=false)
	private String email;
	
	@Temporal(TemporalType.DATE)
	@Column(name="data_nascimento")
	private Date dataNascimento;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public List<ContatoTelefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<ContatoTelefone> telefones) {
		this.telefones = telefones;
	}
}
