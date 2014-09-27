package br.com.treinar.bb;

public class Conta {

	public Long codigo;
	public Double saldo;
	public Cliente cliente;
	
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
