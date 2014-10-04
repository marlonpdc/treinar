package br.com.treinar.bb.controle;

import br.com.treinar.bb.dado.BaseDados;

public class DepositoControle {
	
	public void depositar(Double valor) {
		BaseDados.getInstance().conta.depositar(valor);
	}
	
}
