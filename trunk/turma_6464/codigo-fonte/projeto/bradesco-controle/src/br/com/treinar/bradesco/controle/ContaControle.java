package br.com.treinar.bradesco.controle;

import java.util.Date;

import br.com.treinar.bradesco.banco.BradescoUtil;
import br.com.treinar.bradesco.banco.Conta;

public class ContaControle {

	public void cadastrarConta(Conta conta) {
		BradescoUtil util = BradescoUtil.getInstance();
		conta.setDataCriacao(new Date());
		util.adicionarConta(conta);
	}
	
	public void depositar(Double valor, Long numeroConta) {
		BradescoUtil util = BradescoUtil.getInstance();
		Conta c = util.recuperarConta(numeroConta);
		c.depositar(valor);
	}

	public Boolean sacar(Double valor, Long numeroConta) {
		BradescoUtil util = BradescoUtil.getInstance();
		Conta c = util.recuperarConta(numeroConta);
		Boolean sucesso = c.sacar(valor);
		return sucesso;
	}

	public Double recuperarSaldo(Long numeroConta) {
		BradescoUtil util = BradescoUtil.getInstance();
		Conta c = util.recuperarConta(numeroConta);
		return c.recuperarSaldo();
	}
	
}
