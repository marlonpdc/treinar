package br.com.treinar.bb.modelo.banco;

import br.com.treinar.bb.modelo.Cliente;

public abstract class Conta {

	private double saldo;
	private Cliente cliente;

	public boolean sacar(double valor) {
		boolean saqueEfetuado = false;
		if (saldo >= valor) {
			saldo -= valor;
			saqueEfetuado = true;
		}
		return saqueEfetuado;
	}
	
	public boolean depositar(double valor) {
		boolean depositoEfetuado = false;
		if (valor > 0) {
			saldo += valor;
			depositoEfetuado = true;
		}
		return depositoEfetuado;
	}
	
	public double recuperarSaldo(){
		return saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
