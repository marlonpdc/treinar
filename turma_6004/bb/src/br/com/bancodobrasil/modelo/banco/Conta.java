package br.com.bancodobrasil.modelo.banco;

import br.com.bancodobrasil.modelo.Cliente;

public abstract class Conta {

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
	
	
}
