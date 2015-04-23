package br.com.treinar.controller;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.treinar.modelo.Acao;
import br.com.treinar.modelo.Pessoa;
import br.com.treinar.modelo.Telefone;


@ViewScoped
@ManagedBean
public class TesteController {

	private Pessoa pessoa;
	private Acao acao;
	
	private List<Pessoa> pessoas;
	
	@PostConstruct
	private void init() {
		acao = Acao.EDIT;
		initPessoa();
		pessoas = new ArrayList<Pessoa>();
	}

	private void initPessoa() {
		pessoa = new Pessoa();
		pessoa.setTelefone(new Telefone());
	}
	
	public void editar(Pessoa pessoa) {
		this.pessoa = pessoa;
		acao = Acao.EDIT;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public void salvar() {
		pessoas.add(pessoa);
		initPessoa();
		FacesContext context = FacesContext.getCurrentInstance();
        
        context.addMessage(null, new FacesMessage("Sucesso",  "Contato Adicionado com sucesso"));
		acao = Acao.LIST;
	}
	
	public void navegar(String acao) {
		initPessoa();
		this.acao = Acao.valueOf(acao);
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public Acao getAcao() {
		return acao;
	}

	public void setAcao(Acao acao) {
		this.acao = acao;
	}
	
}
