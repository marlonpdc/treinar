package br.com.treinar.bb.controle;

import br.com.treinar.bb.banco.Conta;
import br.com.treinar.bb.dado.BaseDados;

public class BancoControle {

	protected String teste;
	
	private void cadastrarConta(Conta conta) {
		BaseDados.getInstance().adicionarConta(conta);
	}

	public void cadastrarContaCorrente(Conta conta) {
		//faz alguma coisa e passa para gravar a conta
		cadastrarConta(conta);
		
	}

	public void cadastrarContaPoupanca(Conta conta) {
		//faz alguma coisa e passa para gravar a conta
		cadastrarConta(conta);
	}

}
