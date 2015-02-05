package br.com.treinar.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.treinar.modelo.Contato;
import br.com.treinar.util.TreinarUtil;

@ManagedBean
@SessionScoped
public class ContatoMB implements Serializable {

	private static final long serialVersionUID = 1147987448801313609L;
	
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
		this.contato = contato;
		return "/pages/contato/editaContato.xhtml";
	}

}
