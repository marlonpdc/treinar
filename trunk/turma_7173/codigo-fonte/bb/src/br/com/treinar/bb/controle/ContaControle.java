package br.com.treinar.bb.controle;

import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.servico.ContaService;

public class ContaControle {

	private ContaService service = new ContaService();
	
	public boolean gravarConta(Conta conta) {
		return service.gravarConta(conta);
	}
	
	public Conta recuperarConta(Long codigoConta) {
		return service.recuperarConta(codigoConta);
	}

	public Conta[] recuperarContas() {
		return service.recuperarContas();
	}

	public void efetuarCaptalizacao() {
		service.captalizar();
	}

	public void efetuarPagamento() {
		service.pagar();
	}

	public void atualizarSituacaoConta(Conta conta, Integer opcao) {
		service.atualizarConta(conta, opcao);
	}
	
//	public boolean editarConta(Conta conta) {
//		ContaService service = new ContaService();
//		return service.gravarConta(conta);
//	}
	
}
