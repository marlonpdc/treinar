package br.com.treinar.bb.banco;

import br.com.treinar.bb.Cliente;

public class Conta {

	public Long codigo;
	public Double saldo;
	public Cliente cliente;
	
	public Conta() {
		super();
	}
	
	public Boolean sacar(Double valor) {
		Boolean sacou = Boolean.FALSE;
		if (saldo >= valor) {
			saldo = saldo - valor;
			sacou = Boolean.TRUE;
		}
		return sacou;
	}
	
	public void depositar(Double valor) {
		saldo += valor;
	}
	
}
