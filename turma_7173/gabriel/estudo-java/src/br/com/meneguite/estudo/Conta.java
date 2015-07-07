package br.com.meneguite.estudo;

public class Conta {

	public double saldo;
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
		saldo += valor;
		return true;
	}

}
