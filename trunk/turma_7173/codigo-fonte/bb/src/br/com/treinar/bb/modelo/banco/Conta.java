package br.com.treinar.bb.modelo.banco;

import br.com.treinar.bb.modelo.Cliente;

/**
 * @author ADM
 *
 */
public abstract class Conta {

	private Long codigoConta;
	private static Long indexador;
	private Double saldo;
	private Cliente cliente;

	static {
		indexador = Long.valueOf(0);
	}
	
	public Conta() {
		saldo = 0D;
		codigoConta = ++indexador;
	}
	
	public abstract Boolean sacar(Double valor);
	
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

}
