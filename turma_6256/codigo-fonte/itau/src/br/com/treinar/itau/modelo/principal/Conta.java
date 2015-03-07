package br.com.treinar.itau.modelo.principal;

import java.util.Date;

public abstract class Conta {

	public Integer numeroConta;
	protected Double saldo;
	public Pessoa pessoa;
	
	public Conta(Integer numeroConta) {
		this();
		this.numeroConta = numeroConta;
	}
	
	public Conta() {
		saldo = 0d;
	}
	
	public Boolean sacar(Double valor) {
		Boolean sacou = Boolean.FALSE;
		if (this.saldo >= valor) {
			this.saldo -= valor;
			sacou = Boolean.TRUE;
		}
		return sacou;
	}
	
	public void depositar(Double valor) {
		saldo += valor;
	}
	
	public void depositar(Double valor, Date dataCredito) {
		//alguma regra com a data
		depositar(valor);
	}
	
	public Double recuperarSaldo() {
		return saldo;
	}

	
}
