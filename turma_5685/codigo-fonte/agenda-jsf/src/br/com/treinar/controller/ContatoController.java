package br.com.treinar.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import br.com.treinar.agenda.modelo.Contato;
import br.com.treinar.agenda.modelo.Telefone;
import br.com.treinar.agenda.modelo.TipoTelefone;
import br.com.treinar.util.Acao;
import br.com.treinar.util.DataBase;

@ManagedBean
public class ContatoController {

	private Contato contato;
	
	private Acao acao;
	
	@ManagedProperty(value="#{telefoneController}")
	private TelefoneController listContato;

	@PostConstruct
	private void init() {
		contato = new Contato();
		contato.setTelefone(new Telefone());
		acao = Acao.CRIAR;
	}

	public void salvar() {
		DataBase.getInstance().getContatos().add(contato);
		FacesMessage message = new FacesMessage("Contato gravado com sucesso!");
		FacesContext.getCurrentInstance().addMessage(null, message);
		init();
	}
	
	public void editar() {
		List<Contato> contatos = DataBase.getInstance().getContatos();
		Contato c = contatos.get(contatos.indexOf(contato));
		acao = Acao.EDITAR;
		System.out.println(c);
		System.out.println(contato);
	}
			
	public String selecionar(Contato contato) {
		this.contato = contato;
		acao = Acao.EDITAR;
		return "contato";
	}

	public void excluir(Contato contato) {
		DataBase.getInstance().getContatos().remove(contato);
		init();
	}
	
	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	public TipoTelefone[] getTiposTelefone() {
		return TipoTelefone.values();
	}

	public TelefoneController getListContato() {
		return listContato;
	}

	public void setListContato(TelefoneController listContato) {
		this.listContato = listContato;
	}
	
	public List<Contato> getContatos() {
		return DataBase.getInstance().getContatos();
	}

	public Acao getAcao() {
		return acao;
	}

	public void setAcao(Acao acao) {
		this.acao = acao;
	}
	
}
