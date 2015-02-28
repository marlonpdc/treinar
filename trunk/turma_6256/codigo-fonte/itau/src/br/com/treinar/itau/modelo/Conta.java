package br.com.treinar.itau.modelo;

public class Conta {

	public Integer numeroConta;
	public Double saldo;
	public Pessoa pessoa;
	
	public boolean sacar(Double valor) {
		boolean sacou = false;
		if (saldo >= valor) {
			saldo -= valor;
			sacou = true;
		}
		return sacou;
	}
	
	public void depositar(Double valor) {
		saldo += valor;
	}
	
}
