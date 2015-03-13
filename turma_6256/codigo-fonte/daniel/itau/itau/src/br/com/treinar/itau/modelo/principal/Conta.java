package br.com.treinar.itau.modelo.principal;

import java.util.Date;

public abstract class Conta {

	private Integer numeroConta;
	protected Double saldo;
	private Pessoa pessoa;
	public static final Integer horaAbertura;
	public static final Integer horaFechamento;

	
	public Conta(Integer numeroConta) {
		this();
		this.setNumeroConta(numeroConta);
	}
	
	static {
		horaAbertura = 10;
		horaFechamento = 16;		
	}
	
	public Conta() {
		saldo = 0d;
	}
	
	/**
	 * Efetua o saque, removendo o valor informado no parametro do saldo
	 * da conta
	 * @param valor valor a resr removido da conta
	 * @return verdadeiro se o saque for efetuado e 
	 * falso se não for possível sacar
	 */
	public Boolean sacar(Double valor) {
		Boolean sacou = Boolean.FALSE;
		if (this.saldo >= valor) {
			this.saldo -= valor;
			sacou = Boolean.TRUE;
		}
		return sacou;
	}
	
	/**
	 * Efetua o saque mesmo que o cliente não possua mais recursos 
	 * disponiveis, este método pode deixar a conta com um valor negativo
	 * maior do que o limite disponível
	 * 
	 * @param valor valor a resr removido da conta
	 * @param permitirSaldoNegativo, define se o saldo da conta pode ficar 
	 * menor do que o limite de credito
	  * @return verdadeiro se o saque for efetuado e 
	 * falso se não for possível sacar
	 */
	public Boolean sacar(Double valor, Boolean permitirSaldoNegativo) {
		Boolean sacou = Boolean.FALSE;
		if (permitirSaldoNegativo) {
			this.saldo -= valor;
			sacou = Boolean.TRUE;
		} else {
			sacou = sacar(valor);
		}
		return sacou;
	}
	
	public void depositar(Double valor) {
		saldo += valor;
	}
	
	public void depositar(Double valor, Date dataCredito) {
		//alguma regra com a data
		depositar(valor);
	}
	
	public abstract Double recuperarSaldo();

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	
}
