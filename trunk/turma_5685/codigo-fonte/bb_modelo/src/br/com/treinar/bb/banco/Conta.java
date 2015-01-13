package br.com.treinar.bb.banco;

import java.io.Serializable;

import br.com.treinar.bb.Cliente;
import br.com.treinar.bb.exception.BBException;
import br.com.treinar.bb.exception.SaldoInsuficienteException;
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
	
	public abstract void sacar(Double valor) throws SaldoInsuficienteException;
	
	public void depositar(Double valor) throws BBException {
		saldo += valor;
	}
	
	public abstract Double recuperarSaldo() throws BBException;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Boolean mesmaClasse = obj instanceof Conta;
		if (!mesmaClasse)
			return false;
		Conta other = (Conta) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
