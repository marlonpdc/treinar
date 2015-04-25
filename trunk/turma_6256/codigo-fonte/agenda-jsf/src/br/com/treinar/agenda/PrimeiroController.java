package br.com.treinar.agenda;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.com.agenda.modelo.Contato;
import br.com.agenda.modelo.Pessoa;
import br.com.agenda.util.ContatoDatabase;


@ManagedBean(name="primeiro")
public class PrimeiroController {

	private Pessoa pessoa;

	private List<Contato> contatos;
	
	@PostConstruct
	private void init() {
		pessoa = new Pessoa();
		contatos = ContatoDatabase.getInstance().getContatos();
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public void exibirMensagem() {
		System.out.println(pessoa);
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}
	
	public void editar(Contato contato) {
		System.out.println(contato);
	}
	
	public void excluir(Contato contato) {
		System.out.println(contato);
	}
	
}
