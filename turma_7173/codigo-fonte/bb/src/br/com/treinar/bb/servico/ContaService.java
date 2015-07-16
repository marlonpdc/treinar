package br.com.treinar.bb.servico;

import br.com.treinar.bb.modelo.SituacaoConta;
import br.com.treinar.bb.modelo.banco.BBException;
import br.com.treinar.bb.modelo.banco.Constante;
import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.modelo.banco.ContaBloqueadaException;
import br.com.treinar.bb.modelo.banco.ICaptalizavel;
import br.com.treinar.bb.modelo.banco.IPagavel;
import br.com.treinar.bb.modelo.banco.SaldoInsuficienteException;
import br.com.treinar.bb.util.DatabaseCollection;
import br.com.treinar.bb.util.IDatabase;

public class ContaService {

	
	private IDatabase instance;
	
	public ContaService() {
		//instance = DatabaseArray.getInstance();
		instance = DatabaseCollection.getInstance();
	}
	
	public void gravarConta(Conta conta) throws BBException {
		instance.inserirConta(conta);
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
					try {
						pagar((IPagavel) contas[i]);
					} catch (SaldoInsuficienteException e) {
						System.out.println("comunica gestor da conta...");
					}
				}
			}
		}
	}

	private void pagar(IPagavel iPagavel) throws SaldoInsuficienteException {
		iPagavel.pagar();
	}

	public void atualizarConta(Conta conta, Integer opcao) {
		conta.setSituacao(SituacaoConta.recuperarSituacaoPorOrdinal(opcao));
	}

	public void sacar(Conta conta, Double valor) throws SaldoInsuficienteException, ContaBloqueadaException, BBException {
		switch (conta.getSituacao()) {
			case ATIVA:			
				conta.sacar(valor);
				break;
			case BLOQUEADA:
				throw new ContaBloqueadaException();
			case CANCELADA:
			BBException bbException = new BBException();
			bbException.setCodigoErroNegocio(Constante.Mensagens.ERRO_CONTA_BLOQUEADA);
			
			throw bbException;			
			default:
				break;
		}
		
	}
	
}
