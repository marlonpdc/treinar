package br.com.treinar.bradesco.banco;

import br.com.treinar.bradesco.Titular;

public abstract class Conta {
	
	private Long numeroConta;
	
	protected Double saldo;
	
	public Conta() {
		this.saldo = 0d;
	}
	
	private Titular titular;

	public Long getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Long numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Boolean sacar(Double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			//saldo = saldo - valor;
			return true;
		}
		return false;
	}
	
	public void depositar(Double valor) {
		saldo += valor;
	}
	
	protected Double getSaldo() {
		return saldo;
	}

	protected void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public abstract Double recuperarSaldo();
	
}
