package br.com.treinar.bb.controle;


import br.com.treinar.bb.modelo.BBUtil;
import br.com.treinar.bb.modelo.ContaPoupanca;
import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.modelo.exception.SaldoInsuficienteException;

public class ContaControle {

	private BBUtil util;
	
	public ContaControle() {
		util = BBUtil.getInstance();
	}
	
	public void adicionarConta(Conta conta) {
		util.adicionarConta(conta);
	}

	public void editarTaxaRendimento(Double novaTaxa) {
		ContaPoupanca.setTaxaRendimento(novaTaxa);
	}
	
	public Conta recuperarConta(Long id) {
		return BBUtil.getInstance().recuperarConta(id);
	}

	public void captalizarContas() {
		util.captalizar();
	}

	public void cobrarTarifa() {
		util.cobrarTarifa();
	}

	public Conta[] recuperarContas() {
		return util.recuperarContas();
	}

	public void depositar(Conta conta, Double valor) {
		conta.depositar(valor);
	}

	public void sacar(Conta conta, Double valor) throws SaldoInsuficienteException {
		conta.sacar(valor);
	}

}
