package br.com.treinar.bb.modelo.banco;

import br.com.treinar.bb.modelo.Cliente;

public abstract class Conta {

	private Double saldo;
	private Cliente cliente;

	public abstract Boolean sacar(Double valor);
	
	public Boolean depositar(Double valor) {
		Boolean depositoEfetuado = Boolean.FALSE;
		if (valor > 0) {
			saldo += valor;
			depositoEfetuado = Boolean.TRUE;
		}
		return depositoEfetuado;
	}
	
	public abstract Double recuperarSaldo();

	protected double getSaldo() {
		return saldo;
	}

	protected void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
