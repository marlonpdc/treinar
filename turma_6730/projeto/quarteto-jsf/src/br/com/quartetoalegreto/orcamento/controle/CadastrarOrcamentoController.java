package br.com.quartetoalegreto.orcamento.controle;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.quartetoalegreto.orcamento.modelo.Cliente;
import br.com.quartetoalegreto.orcamento.modelo.Evento;
import br.com.quartetoalegreto.orcamento.modelo.Orcamento;
import br.com.quartetoalegreto.orcamento.modelo.Telefone;

@ViewScoped
@ManagedBean(name="cadastrar")
public class CadastrarOrcamentoController implements Serializable {

	private static final long serialVersionUID = 5703821890306156997L;
	
	private Orcamento orcamento;
	
	@PostConstruct
	private void init() {
		orcamento = new Orcamento();
		orcamento.setCodigoOrcamento("10481");
		orcamento.setCliente(new Cliente());
		orcamento.getCliente().setTelefone(new Telefone());
		orcamento.setEvento(new Evento());
	}
	
	public void gravar() {
		System.out.println(orcamento);
	}

	public void validarEmail() {
		System.out.println("validarEmail");
	}
	
	public Orcamento getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(Orcamento orcamento) {
		this.orcamento = orcamento;
	}

}
