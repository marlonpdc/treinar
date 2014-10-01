package br.com.bancodobrasil.modelo.banco;

import br.com.bancodobrasil.modelo.Cliente;

public abstract class Conta implements Comparable<Conta> {

	public static final String nomeConta = null;
	public Long numeroConta;
	protected Double saldo;
	public Cliente proprietario;
	
	public Conta(double saldo) {
		this();
		depositar(saldo);
	}
	public Conta(double saldo, Long numero) {
		this(saldo);
	}
	public Conta() {
		saldo = 0d;
	}
	
	public void depositar(Double valor) {
		saldo = saldo + valor;
	}
	
	/**
	 * Método responsavel por recuperar o valor do saldo da conta
	 * @return
	 */
	public abstract Double recuperarSaldo();
			
	public abstract Boolean sacar(Double valorSacado);
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
	public int compareTo(Conta o) {
		return this.proprietario.nome.compareToIgnoreCase(o.proprietario.nome);
	}
	
	@Override
	public String toString() {
		return proprietario.nome;
	}
	
}
