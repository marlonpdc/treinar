package br.com.treinar.bb.controle;


import java.io.IOException;
import java.util.List;

import br.com.treinar.bb.modelo.ContaPoupanca;
import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.modelo.exception.ContaNaoCadastradaException;
import br.com.treinar.bb.modelo.exception.NenhumaContaCadastradaException;
import br.com.treinar.bb.modelo.exception.SaldoInsuficienteException;
import br.com.treinar.bb.modelo.exception.SaldoNaoDisponivelException;
import br.com.treinar.bb.modelo.exception.SemDisponibilidadeException;
import br.com.treinar.bb.modelo.exception.ValorInvalidoException;
import br.com.treinar.bb.util.BBUtil;

public class ContaControle {

	private BBUtil util;
	
	public ContaControle() {
		util = BBUtil.getInstance();
	}
	
	public void adicionarConta(Conta conta) throws SemDisponibilidadeException {
		util.adicionarConta(conta);
	}

	public void editarTaxaRendimento(Double novaTaxa) {
		ContaPoupanca.setTaxaRendimento(novaTaxa);
	}
	
	public Conta recuperarConta(Long id) throws ContaNaoCadastradaException {
		return BBUtil.getInstance().recuperarConta(id);
	}

	public void captalizarContas() {
		util.captalizar();
	}

	public void cobrarTarifa() {
		util.cobrarTarifa();
	}

	public List<Conta> recuperarContas() throws NenhumaContaCadastradaException {
		return util.recuperarContas();
	}

	public void depositar(Conta conta, Double valor) throws ValorInvalidoException {
		conta.depositar(valor);
	}

	public void sacar(Conta conta, Double valor) throws SaldoInsuficienteException, ValorInvalidoException, SaldoNaoDisponivelException {
		conta.sacar(valor);
	}
	
	public void manterContas() throws IOException {
		util.manterContas();
	}

	public void excluirConta(Conta c) {
		util.excuirConta(c);
	}

}
