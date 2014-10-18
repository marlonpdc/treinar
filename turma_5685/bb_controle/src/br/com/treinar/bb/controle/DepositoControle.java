package br.com.treinar.bb.controle;

import br.com.treinar.bb.banco.Conta;
import br.com.treinar.bb.dado.BaseDados;

public class DepositoControle {
	
	public void depositar(Long codigo, Double valor) {
		Conta conta = BaseDados.getInstance().recuperarContaPorCodigo(codigo);
		conta.depositar(valor);
	}
	
}
