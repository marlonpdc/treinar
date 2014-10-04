package br.com.treinar.bb.banco;

import br.com.treinar.bb.Cliente;

public abstract class Conta {

	public Long codigo;
	protected Double saldo;
	public Cliente cliente;
	
	public Conta() {
		super();
		saldo = 0d;
	}
	
	public abstract Boolean sacar(Double valor);
	
	public void depositar(Double valor) {
		saldo += valor;
	}
	
	public abstract Double recuperarSaldo();
	
	
}
