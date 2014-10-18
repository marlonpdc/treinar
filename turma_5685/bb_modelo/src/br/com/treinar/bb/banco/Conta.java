package br.com.treinar.bb.banco;

import java.io.Serializable;

import br.com.treinar.bb.Cliente;
import br.com.treinar.enumerators.StatusConta;

public abstract class Conta implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public Long codigo;
	protected Double saldo;
	public Cliente cliente;
	private StatusConta statusConta;
	
	public Conta() {
		super();
		saldo = 0d;
	}
	
	public abstract Boolean sacar(Double valor);
	
	public void depositar(Double valor) {
		saldo += valor;
	}
	
	public abstract Double recuperarSaldo();

	public StatusConta getStatusConta() {
		return statusConta;
	}

	public void setStatusConta(StatusConta statusConta) {
		this.statusConta = statusConta;
	}
	
	
	
}
