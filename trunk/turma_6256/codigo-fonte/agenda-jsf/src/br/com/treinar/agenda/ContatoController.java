package br.com.treinar.agenda;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.agenda.modelo.Contato;
import br.com.agenda.modelo.Pessoa;
import br.com.agenda.modelo.Telefone;

@ManagedBean
@SessionScoped
public class ContatoController {

	private Contato contato;
	private List<Contato> contatos;
	
	public ContatoController() {
		contatos = new ArrayList<Contato>();
		criarNovoContato();
	}
	
	private void criarNovoContato() {
		contato = new Contato();
		contato.setPessoa(new Pessoa());
		contato.setTelefone(new Telefone());
	}
	
	public void salvar() {
		contatos.add(contato);
		criarNovoContato();
		FacesMessage message = new FacesMessage("Contato salvo com sucesso!");
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
	
	public void editar(Contato contato) {
		System.out.println(contato);
	}
	
	public void excluir(Contato contato) {
		System.out.println(contato);
	}
	
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	public List<Contato> getContatos() {
		return contatos;
	}
	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}
	
}
