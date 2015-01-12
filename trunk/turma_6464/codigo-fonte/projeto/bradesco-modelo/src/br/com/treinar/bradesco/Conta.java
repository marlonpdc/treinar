package br.com.treinar.bradesco;

public class Conta {

	public Long numeroConta;
	
	public Double saldo;
	
	public Titular titular;
	
	
	public void sacar(Double valor) {
		saldo -= valor;
		//saldo = saldo - valor;
	}
	
	public void depositar(Double valor) {
		saldo += valor;
	}
	
}
