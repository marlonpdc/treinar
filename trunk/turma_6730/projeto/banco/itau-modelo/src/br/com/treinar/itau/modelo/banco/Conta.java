package br.com.treinar.itau.modelo.banco;

import java.util.Date;

public abstract class Conta {

	private Integer numeroConta;
	private Pessoa pessoa;
	protected Double saldo;
	
	public Conta(Pessoa pessoa) {
		this();
		this.pessoa = pessoa;
	}
	
	public Conta() {
		pessoa = new Pessoa();
		this.saldo = 0d;
	}
	
	public Boolean depositar(Double valor) {
		Boolean deuCerto = Boolean.TRUE;
		//regra para deopositar
		saldo += valor;		
		return deuCerto;
	}
	
	/**
	 * 
	 * Metodo responsavel por depositar valores em uma conta
	 * 
	 * 
	 * @param valor montante a ser depositado, serah acumulado ao saldo
	 * @param dataCredito - dia em que o credito serah efetivado
	 * @return verdadeir caso o deposito tenha sido efetivado e falso caso contrario
	 */
	public Boolean depositar(Double valor, Date dataCredito) {
		//qualquer regra com a data
		return this.depositar(valor);
	}
	
	public void sacar(Double valor) throws ItauException {
		if (saldo >= valor) {
			saldo -= valor;
		} else {
			throw new ItauException("Saldo Insuficiente");
		}
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

	@Override
	public String toString() {
		return "Conta [numeroConta=" + numeroConta + pessoa
				+ ", saldo=" + saldo + "]";
	}
	
	
}
