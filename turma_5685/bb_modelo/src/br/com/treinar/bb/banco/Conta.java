package br.com.treinar.bb.banco;

import java.io.Serializable;

import br.com.treinar.bb.Cliente;

public abstract class Conta implements Serializable {

	private static final long serialVersionUID = 1L;
	
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
