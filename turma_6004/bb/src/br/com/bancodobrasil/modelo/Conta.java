package br.com.bancodobrasil.modelo;

public class Conta {

	public Long numeroConta;
	public double saldo;
	public Cliente proprietario;
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public double recuperarSaldo() {
		return saldo;
	}
	
	
}
