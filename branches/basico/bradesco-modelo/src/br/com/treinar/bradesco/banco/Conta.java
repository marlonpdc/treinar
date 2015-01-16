package br.com.treinar.bradesco.banco;

import java.util.Date;

import br.com.treinar.bradesco.Titular;

public abstract class Conta {
	
	private Long numeroConta;
	
	protected Double saldo;
	
	private Date dataCriacao;
	
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

	public abstract Boolean sacar(Double valor);
	
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

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
}
