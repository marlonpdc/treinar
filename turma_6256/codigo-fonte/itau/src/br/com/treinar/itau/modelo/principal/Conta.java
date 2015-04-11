package br.com.treinar.itau.modelo.principal;

import java.util.Date;

import br.com.treinar.itau.exception.SaldoInsuficienteException;

public abstract class Conta {

	private Integer numeroConta;
	private Double saldo;
	private Pessoa pessoa;
	private static final Integer horaAbertura;
	private static final Integer horaFechamento;

	public Conta(Integer numeroConta) {
		this();
		this.pessoa = new Pessoa();
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
	 * Efetua o saque, removendo o valor informado no parametro do saldo da
	 * conta
	 * 
	 * @param valor
	 *            valor a resr removido da conta
	 * @return verdadeiro se o saque for efetuado e falso se não for possível
	 *         sacar
	 */
	public void sacar(Double valor) throws SaldoInsuficienteException {
		if (this.saldo >= valor) {
			this.saldo -= valor;
		} else {
			SaldoInsuficienteException sie = new SaldoInsuficienteException();
			throw sie;
		}
	}

	/**
	 * Efetua o saque mesmo que o cliente não possua mais recursos disponiveis,
	 * este método pode deixar a conta com um valor negativo maior do que o
	 * limite disponível
	 * 
	 * @param valor
	 *            valor a resr removido da conta
	 * @param permitirSaldoNegativo
	 *            , define se o saldo da conta pode ficar menor do que o limite
	 *            de credito
	 * @return verdadeiro se o saque for efetuado e falso se não for possível
	 *         sacar
	 * @throws SaldoInsuficienteException
	 */
	public void sacar(Double valor, Boolean permitirSaldoNegativo)
			throws SaldoInsuficienteException {
		if (permitirSaldoNegativo) {
			this.saldo -= valor;
		} else {
			sacar(valor);
		}
	}

	public void depositar(Double valor) {
		saldo += valor;
	}

	public void depositar(Double valor, Date dataCredito) {
		// alguma regra com a data
		depositar(valor);
	}

	public abstract Double recuperarSaldo();

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	protected Double getSaldo() {
		return saldo;
	}

	protected void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public static Integer getHoraabertura() {
		return horaAbertura;
	}

	public static Integer getHorafechamento() {
		return horaFechamento;
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
		return numeroConta.toString();
	}

}
