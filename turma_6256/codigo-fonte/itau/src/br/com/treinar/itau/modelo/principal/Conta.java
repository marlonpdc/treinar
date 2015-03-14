package br.com.treinar.itau.modelo.principal;

import java.util.Date;

public abstract class Conta {

	public Integer numeroConta;
	protected Double saldo;
	public Pessoa pessoa;
	public static final Integer horaAbertura;
	public static final Integer horaFechamento;

	
	public Conta(Integer numeroConta) {
		this();
		this.numeroConta = numeroConta;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((numeroConta == null) ? 0 : numeroConta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numeroConta == null) {
			if (other.numeroConta != null)
				return false;
		} else if (!numeroConta.equals(other.numeroConta))
			return false;
		return true;
	}
	
	

	
}
