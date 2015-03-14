package br.com.treinar.itau.controle;

import br.com.treinar.itau.modelo.principal.Conta;
import br.com.treinar.itau.util.ItauUtil;

public class ItauControle {

	private ItauUtil dataBase = ItauUtil.getInstance();

	public void salvarConta(Conta conta) {
		dataBase.adicionarConta(conta);
	}

	public Conta recuperarConta(Integer numeroConta) {
		return dataBase.recuperar(numeroConta);
	}

	public void removerConta(Conta conta) {
		dataBase.remover(conta);
	}


}
