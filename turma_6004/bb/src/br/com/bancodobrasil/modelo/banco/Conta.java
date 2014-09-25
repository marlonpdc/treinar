package br.com.bancodobrasil.modelo.banco;

import br.com.bancodobrasil.modelo.Cliente;

public abstract class Conta {

	public Long numeroConta;
	public Double saldo;
	public Cliente proprietario;
	
	public Conta(double saldo) {
		this();
		depositar(saldo);
	}
	public Conta(double saldo, Long numero) {
		this(saldo);
	}
	public Conta() {
		saldo = 0d;
	}
	
	public void depositar(Double valor) {
		saldo = saldo + valor;
	}
	
	public double recuperarSaldo() {
		return saldo;
	}
	
	public Boolean sacar(Double valorSacado) {
		Boolean sacou = Boolean.FALSE;
		if (saldo >= valorSacado) {
			saldo = saldo - valorSacado;
			sacou = Boolean.TRUE;
		}
		return sacou;
	}
	
	
}
