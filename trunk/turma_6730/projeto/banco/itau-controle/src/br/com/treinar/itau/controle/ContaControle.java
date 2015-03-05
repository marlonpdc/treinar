package br.com.treinar.itau.controle;

import br.com.treinar.itau.modelo.banco.Conta;
import br.com.treinar.itau.modelo.util.ItauUtil;

public class ContaControle {

	private ItauUtil utilitario;
	
	public ContaControle() {
		utilitario = ItauUtil.getInstance();
	}
	
	public Boolean gravarConta(Conta conta) {
		return utilitario.adicionarConta(conta);
	}
	
	public Conta recuperarConta(Integer numeroConta) {
		return utilitario.recuperarConta(numeroConta);
	}

	public void tarifarContas() {
		utilitario.tarifarContas();
	}

	public void captalizarContas() {
		utilitario.captalizarContas();
	}
	
}
