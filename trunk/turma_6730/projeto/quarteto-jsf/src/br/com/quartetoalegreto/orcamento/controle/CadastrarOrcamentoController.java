package br.com.quartetoalegreto.orcamento.controle;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.quartetoalegreto.orcamento.Acao;
import br.com.quartetoalegreto.orcamento.Util;
import br.com.quartetoalegreto.orcamento.modelo.Cliente;
import br.com.quartetoalegreto.orcamento.modelo.Evento;
import br.com.quartetoalegreto.orcamento.modelo.Orcamento;
import br.com.quartetoalegreto.orcamento.modelo.Telefone;

@ViewScoped
@ManagedBean(name="cadastrar")
public class CadastrarOrcamentoController implements Serializable {

	private static final long serialVersionUID = 5703821890306156997L;
	
	@ManagedProperty(value="#{quartetoSession}")
	private QuartetoSession session;
	
	private Orcamento orcamento;
	private List<Orcamento> orcamentos;
	
	@PostConstruct
	private void init() {
		orcamento = new Orcamento();
		orcamento.setCliente(new Cliente());
		orcamento.getCliente().setTelefone(new Telefone());
		orcamento.setEvento(new Evento());
		orcamentos = Util.orcamentos;
	}
	
	public void gravar() {
		Util.orcamentos.add(orcamento);
		FacesMessage msg =
	            new FacesMessage("Oçamento gravado com sucesso!","Oçamento gravado com sucesso!");
	    msg.setSeverity(FacesMessage.SEVERITY_INFO);
	    FacesContext.getCurrentInstance().addMessage(null, msg);
	    session.setAcao(Acao.LISTAR);
	}
	
	public void validarEmail(String email) {
		System.out.println("validarEmail");
	}
	
	public void editar(Orcamento o) {
		orcamento = o;
		session.setAcao(Acao.EDITAR);
	}
	
	public void novoOrcamento() {
		init();
		orcamento = new Orcamento();
		session.setAcao(Acao.EDITAR);
	}
	
	public Orcamento getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(Orcamento orcamento) {
		this.orcamento = orcamento;
	}

	public List<Orcamento> getOrcamentos() {
		return orcamentos;
	}

	public void setOrcamentos(List<Orcamento> orcamentos) {
		this.orcamentos = orcamentos;
	}

	public QuartetoSession getSession() {
		return session;
	}

	public void setSession(QuartetoSession session) {
		this.session = session;
	}

}
