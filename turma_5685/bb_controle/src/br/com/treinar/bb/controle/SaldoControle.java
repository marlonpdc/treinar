package br.com.treinar.bb.controle;

import br.com.treinar.bb.banco.Conta;
import br.com.treinar.bb.dado.BaseDados;


public class SaldoControle {

	public Double recuperarSaldo(Long codigo){
		Conta conta = BaseDados.getInstance().recuperarContaPorCodigo(codigo);
		return conta.recuperarSaldo();
	}          

}