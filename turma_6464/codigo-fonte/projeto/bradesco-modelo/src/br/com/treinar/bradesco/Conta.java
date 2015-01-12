package br.com.treinar.bradesco;

public abstract class Conta {
	
	private Long numeroConta;
	
	public Double saldo;
	
	public Titular titular;

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
	
}
