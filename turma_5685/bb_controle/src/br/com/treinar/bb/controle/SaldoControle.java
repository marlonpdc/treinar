package br.com.treinar.bb.controle;

import br.com.treinar.bb.dado.BaseDados;


public class SaldoControle {

	public Double recuperarSaldo(){
		return BaseDados.getInstance().conta.recuperarSaldo();
	}          

}