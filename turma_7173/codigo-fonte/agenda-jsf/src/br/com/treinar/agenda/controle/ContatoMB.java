package br.com.treinar.agenda.controle;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.com.treinar.agenda.Contato;
import br.com.treinar.agenda.Telefone;
import br.com.treinar.agenda.TipoTelefone;

@ManagedBean
public class ContatoMB {

	private List<TipoTelefone> tiposTelefone;
	
	private TipoTelefone tipoTelefone;
	
	private Telefone telefone;
	
	private String nome;
	
	private Integer opcao;
	
	private Date dataNascimento;
	
	private Contato contato;
	
	

	@PostConstruct
	private void init() {
		nome = "Gleidson";
		tiposTelefone = Arrays.asList(TipoTelefone.values());		
		dataNascimento = new Date();
		telefone = new Telefone();
	}
	
	public ContatoMB() {
		System.out.println("");
	}

	public String getNome() {
		return nome;
	}

	public void testarMB() {
		nome = nome.toUpperCase() + " OK";
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getOpcao() {
		return opcao;
	}

	public void setOpcao(Integer opcao) {
		this.opcao = opcao;
	}

	public List<TipoTelefone> getTiposTelefone() {
		return tiposTelefone;
	}

	public void setTiposTelefone(List<TipoTelefone> tiposTelefone) {
		this.tiposTelefone = tiposTelefone;
	}

	public TipoTelefone getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(TipoTelefone tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

}
