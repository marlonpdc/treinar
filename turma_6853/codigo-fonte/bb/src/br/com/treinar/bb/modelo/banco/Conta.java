package br.com.treinar.bb.modelo.banco;

import java.util.Date;

import br.com.treinar.bb.modelo.Cliente;
import br.com.treinar.bb.modelo.StatusConta;
import br.com.treinar.bb.modelo.exception.SaldoInsuficienteException;
import br.com.treinar.bb.modelo.exception.ValorInvalidoException;
import br.com.treinar.bb.modelo.exception.SaldoNaoDisponivelException;

/**
 * Classe para 
 * @author ADM
 *
 */
public abstract class Conta {

	private Long id;
	private Cliente cliente;
	private Double saldo;
	private Date dataAbertura;
	private StatusConta statusConta;
	
	private static Long indexador;
	
	static {
		indexador = 1l;
	}
	
	public Conta() {
		id = new Long(indexador++);
		this.saldo = 0d;
	}
	
	public void depositar(Double valor) throws ValorInvalidoException {
		saldo += valor;
	}
	
	public abstract void sacar(Double valor) throws SaldoInsuficienteException;
	
	public abstract Double recuperarSaldo() throws SaldoNaoDisponivelException;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	protected Double getSaldo() {
		return saldo;
	}

	protected void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public StatusConta getStatusConta() {
		return statusConta;
	}

	public void setStatusConta(StatusConta statusConta) {
		this.statusConta = statusConta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "id=" + id + ", cliente=" + cliente + ", saldo=" + saldo + ", dataAbertura=" + dataAbertura;
	}

}
