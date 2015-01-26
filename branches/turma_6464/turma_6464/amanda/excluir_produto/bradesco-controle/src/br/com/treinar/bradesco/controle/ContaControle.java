package br.com.treinar.bradesco.controle;

import java.util.Date;

import br.com.treinar.bradesco.banco.BradescoUtil;
import br.com.treinar.bradesco.banco.Conta;
import br.com.treinar.bradesco.banco.SaldoInsuficienteException;

public class ContaControle {

	public void cadastrarConta(Conta conta) {
		BradescoUtil util = BradescoUtil.getInstance();
		conta.setDataAquisicao(new Date());
		util.adicionarConta(conta);
	}
	
	public void depositar(Double valor, Long numeroConta) {
		BradescoUtil util = BradescoUtil.getInstance();
		Conta c = util.recuperarConta(numeroConta);
		c.depositar(valor);
	}

	public void sacar(Double valor, Long numeroConta) throws SaldoInsuficienteException {
		BradescoUtil util = BradescoUtil.getInstance();
		Conta c = util.recuperarConta(numeroConta);
		c.sacar(valor);
	}

	public Double recuperarSaldo(Long numeroConta) {
		BradescoUtil util = BradescoUtil.getInstance();
		Conta c = util.recuperarConta(numeroConta);
		return c.recuperarSaldo();
	}
	
}
