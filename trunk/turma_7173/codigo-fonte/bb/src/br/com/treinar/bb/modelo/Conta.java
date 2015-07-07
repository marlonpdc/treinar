package br.com.treinar.bb.modelo;

public class Conta {

	private double saldo;
	public Cliente cliente;

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

}
