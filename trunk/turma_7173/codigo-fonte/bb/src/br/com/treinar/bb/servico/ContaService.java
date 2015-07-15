package br.com.treinar.bb.servico;

import br.com.treinar.bb.modelo.SituacaoConta;
import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.modelo.banco.ICaptalizavel;
import br.com.treinar.bb.modelo.banco.IPagavel;
import br.com.treinar.bb.util.DatabaseCollection;
import br.com.treinar.bb.util.IDatabase;

public class ContaService {

	
	private IDatabase instance;
	
	public ContaService() {
		//instance = DatabaseArray.getInstance();
		instance = DatabaseCollection.getInstance();
	}
	
	public Boolean gravarConta(Conta conta) {
		return instance.inserirConta(conta);
	}
	
	public Conta recuperarConta(Long codigoConta) {
		return instance.selecionar(codigoConta);
	}

	public Conta[] recuperarContas() {
		return instance.getContas();
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

	public void atualizarConta(Conta conta, Integer opcao) {
		conta.setSituacao(SituacaoConta.recuperarSituacaoPorOrdinal(opcao));
	}
	
}
