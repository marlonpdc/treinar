package br.com.treinar.bradesco.banco;

import java.util.Date;

import br.com.treinar.bradesco.Titular;

public abstract class Conta implements IProduto {
	
	private Long numeroConta;
	
	private Long codigo;
	
	protected Double saldo;
	
	private Date dataAquisicao;
	
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

	public abstract void sacar(Double valor) throws SaldoInsuficienteException;
	
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


	@Override
	public Date getDataAquisicao() {
		return dataAquisicao;
	}
	
	public void setDataAquisicao(Date dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}
	
	@Override
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	
}
