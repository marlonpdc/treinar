package br.com.bancodobrasil.modelo.banco;

import br.com.bancodobrasil.modelo.Cliente;

public class Conta {

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
	
	
}
