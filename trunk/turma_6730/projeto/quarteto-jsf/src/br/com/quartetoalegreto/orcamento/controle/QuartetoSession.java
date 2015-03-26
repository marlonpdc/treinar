package br.com.quartetoalegreto.orcamento.controle;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.quartetoalegreto.orcamento.Acao;

@SessionScoped
@ManagedBean
public class QuartetoSession {

	private Acao acao;
	
	@PostConstruct
	private void abacaxi() {
		acao = Acao.LISTAR;
	}

	public Acao getAcao() {
		return acao;
	}

	public void setAcao(Acao acao) {
		this.acao = acao;
	}
	
	
	
}
