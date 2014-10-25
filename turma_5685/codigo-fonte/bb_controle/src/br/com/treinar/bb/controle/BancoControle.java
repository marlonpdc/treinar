package br.com.treinar.bb.controle;

import java.util.List;

import br.com.treinar.bb.banco.Conta;
import br.com.treinar.bb.banco.ICaptalizavel;
import br.com.treinar.bb.banco.ITributavel;
import br.com.treinar.bb.dado.BaseDados;
import br.com.treinar.enumerators.StatusConta;

public class BancoControle {

	private void cadastrarConta(Conta conta)  {
		if (!validarExistenciaConta(conta)) {
			conta.setStatusConta(StatusConta.ATIVO);
			BaseDados.getInstance().adicionarConta(conta);			
		}
	}

	private Boolean validarExistenciaConta(Conta conta) {
																				List<Conta> contas = BaseDados.getInstance().recuperarContasAtivas();
		Boolean jahExiste = Boolean.FALSE;
		for (Conta c : contas) {
			if (c != null && c.equals(conta)) {
				jahExiste = Boolean.TRUE;
				break;
			}
		}
		return jahExiste;
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
		List<Conta> contas = BaseDados.getInstance().recuperarContasAtivas();
		ITributavel it = null;
		for (Conta c : contas) {
			if (c instanceof ITributavel) {
				it = (ITributavel) c;
				it.tributar();
			}
		}
	}
	
	public void captalizar() {
		List<Conta> contas = BaseDados.getInstance().recuperarContasAtivas();
		ICaptalizavel ic = null;
		for (Conta c : contas) {
			if (c instanceof ICaptalizavel) {
				ic = (ICaptalizavel) c;
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
