package br.com.treinar.agenda.controle;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.treinar.agenda.Contato;
import br.com.treinar.agenda.Database;
import br.com.treinar.agenda.Telefone;
import br.com.treinar.agenda.modelo.Acao;

@ManagedBean
@ViewScoped
public class ContatoMB {
	
	private Acao acao;

	private List<Contato> contatos;

	private Contato contato;

	@PostConstruct
	private void init() {
		recuperarListaContatos();
		contato = new Contato();
		contato.setTelefones(new ArrayList<Telefone>());
		contato.getTelefones().add(new Telefone());
		acao = Acao.LISTAR;
	}

	public void selecionarParaEdicao(Contato contato) {
		this.contato = contato;
		acao = Acao.EDITAR;
	}
	
	public void excluirTelefone(Telefone telefone) {
		this.contato.getTelefones().remove(telefone);
	}
	
	public void adicionarTelefone() {
		this.contato.getTelefones().add(new Telefone());
	}
	
	public void editar() {
		System.out.println(contato);
		acao = Acao.LISTAR;
	}
	
	private void recuperarListaContatos() {
		contatos = Database.getInstance().getContatos();
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Acao getAcao() {
		return acao;
	}

	public void setAcao(Acao acao) {
		this.acao = acao;
	}

}
