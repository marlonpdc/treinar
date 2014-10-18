package br.com.treinar.bb.banco;

import java.io.Serializable;

import br.com.treinar.bb.Cliente;
import br.com.treinar.enumerators.StatusConta;

public abstract class Conta implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long codigo;
	protected Double saldo;
	private Cliente cliente;
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

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Conta [codigo=" + codigo + ", saldo=" + saldo + ", cliente="
				+ cliente.toString() + ", statusConta=" + statusConta + "]";
	}
	
	
	
}
