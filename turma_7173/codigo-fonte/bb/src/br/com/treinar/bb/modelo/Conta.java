package br.com.treinar.bb.modelo;

public class Conta {

	double saldo;
	Cliente cliente;

	public boolean sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		} else {
			return false;

		}

	}

}
