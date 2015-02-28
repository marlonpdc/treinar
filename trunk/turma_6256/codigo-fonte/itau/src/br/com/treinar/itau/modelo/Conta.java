package br.com.treinar.itau.modelo;

public class Conta {

	public Integer numeroConta;
	public Double saldo;
	public Pessoa pessoa;
	
	public Boolean sacar(Double valor) {
		Boolean sacou = Boolean.FALSE;
		if (saldo >= valor) {
			saldo -= valor;
			sacou = Boolean.TRUE;
		}
		return sacou;
	}
	
	public void depositar(Double valor) {
		saldo += valor;
	}
	
}
