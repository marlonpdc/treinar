package br.com.treinar.bb.servico;

import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.modelo.banco.ICaptalizavel;
import br.com.treinar.bb.modelo.banco.IPagavel;
import br.com.treinar.bb.util.Database;

public class ContaService {

	
	public Boolean gravarConta(Conta conta) {
		Database instance = Database.getInstance();
		return instance.inserirConta(conta);
	}
	
	public Conta recuperarConta(Long codigoConta) {
		return Database.getInstance().selecionar(codigoConta);
	}

	public Conta[] recuperarContas() {
		return Database.getInstance().getContas();
	}

	public void captalizar() {
		Conta[] contas = recuperarContas();
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null) {
				if (contas[i] instanceof ICaptalizavel) {
					captalizar((ICaptalizavel) contas[i]);
				}
			}
		}
	}

	private void captalizar(ICaptalizavel conta) {
		conta.captalizar();
	}

	public void pagar() {
		Conta[] contas = recuperarContas();
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null) {
				if (contas[i] instanceof IPagavel) {
					pagar((IPagavel) contas[i]);
				}
			}
		}
	}

	private void pagar(IPagavel iPagavel) {
		iPagavel.pagar();
	}
	
}
