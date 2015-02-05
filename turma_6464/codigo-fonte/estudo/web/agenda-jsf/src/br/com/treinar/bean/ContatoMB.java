package br.com.treinar.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.treinar.modelo.Contato;
import br.com.treinar.util.TreinarUtil;

@ManagedBean
@ViewScoped
public class ContatoMB {

	private Contato contato;
	private List<Contato> contatos;

	@PostConstruct
	private void init() {
		contato = new Contato();
		contatos = TreinarUtil.getInstance().getContatos();
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

	public void gravar() {
		System.out.println(contato);
	}
	
	public String editar(Contato contato) {
		return "/pages/contato/editaContato.xhtml";
	}

}
