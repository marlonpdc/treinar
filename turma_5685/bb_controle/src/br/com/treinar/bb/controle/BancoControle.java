package br.com.treinar.bb.controle;

import br.com.treinar.bb.banco.Conta;
import br.com.treinar.bb.banco.ICaptalizavel;
import br.com.treinar.bb.banco.ITributavel;
import br.com.treinar.bb.dado.BaseDados;
import br.com.treinar.enumerators.StatusConta;

public class BancoControle {

	private void cadastrarConta(Conta conta) {
		conta.setStatusConta(StatusConta.ATIVO);
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
	public void excluirConta(Long codConta) {
		BaseDados.getInstance().excluirConta(codConta);
	}

	public void tributar() {
		Conta[] contas = BaseDados.getInstance().recuperarContas();
		ITributavel it = null;
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] instanceof ITributavel) {
				it = (ITributavel) contas[i];
				it.tributar();
			}
		}
	}
	
	public void captalizar() {
		Conta[] contas = BaseDados.getInstance().recuperarContas();
		ICaptalizavel ic = null;
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] instanceof ICaptalizavel) {
				ic = (ICaptalizavel) contas[i];
				ic.captalizar();
			}
		}
	}

	public void cadastrarContaUniversitaria(Conta conta) {
		cadastrarConta(conta);
	}

	public void cadastrarContaInvestimento(Conta conta) {
		cadastrarConta(conta);		
	}
	
}
