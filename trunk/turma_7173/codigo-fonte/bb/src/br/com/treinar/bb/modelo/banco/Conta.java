package br.com.treinar.bb.modelo.banco;

import java.io.Serializable;

import br.com.treinar.bb.modelo.Cliente;
import br.com.treinar.bb.modelo.SituacaoConta;

/**
 * @author ADM
 *
 */
public abstract class Conta implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long codigoConta;
	private static Long indexador;
	private Double saldo;
	private Cliente cliente;
	private SituacaoConta situacao;

	static {
		indexador = Long.valueOf(0);
	}
	
	public Conta() {
		saldo = 0D;
		codigoConta = ++indexador;
	}
	
	public abstract void sacar(Double valor) 
			throws SaldoInsuficienteException, 
				   ContaBloqueadaException,
				   BBException;
	
	public Boolean depositar(Double valor) {
		Boolean depositoEfetuado = Boolean.FALSE;
		if (valor > 0) {
			saldo += valor;
			depositoEfetuado = Boolean.TRUE;
		}
		return depositoEfetuado;
	}
	
	public abstract Double recuperarSaldo();

	protected double getSaldo() {
		return saldo;
	}

	protected void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Long getCodigoConta() {
		return codigoConta;
	}

	public void setCodigoConta(Long codigoConta) {
		this.codigoConta = codigoConta;
	}

	public SituacaoConta getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoConta situacao) {
		this.situacao = situacao;
	}

	@Override
	public String toString() {
		return codigoConta.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codigoConta == null) ? 0 : codigoConta.hashCode());
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
		if (codigoConta == null) {
			if (other.codigoConta != null)
				return false;
		} else if (!codigoConta.equals(other.codigoConta))
			return false;
		return true;
	}

	
	
}
