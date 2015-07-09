package br.com.treinar.bb.modelo.banco;

import br.com.treinar.bb.modelo.Cliente;

public abstract class Conta {

	private double saldo;
	private Cliente cliente;

	public abstract boolean sacar(double valor);
	
	public boolean depositar(double valor) {
		boolean depositoEfetuado = false;
		if (valor > 0) {
			saldo += valor;
			depositoEfetuado = true;
		}
		return depositoEfetuado;
	}
	
	public abstract double recuperarSaldo();

	protected double getSaldo() {
		return saldo;
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
