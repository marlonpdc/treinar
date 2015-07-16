package br.com.treinar.bb.modelo;

import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.modelo.banco.SaldoInsuficienteException;

public class ContaSalario extends Conta {

	private Integer qtdSaque;

	public Integer getQtdSaque() {
		return qtdSaque;
	}

	public void setQtdSaque(Integer qtdSaque) {
		this.qtdSaque = qtdSaque;
	}

	@Override
	public void sacar(Double valor) throws SaldoInsuficienteException {
		Double saldo = getSaldo();
		if (saldo >= valor) {
			setSaldo(saldo - valor);
		} else {
			throw new SaldoInsuficienteException();
		}
	}

	@Override
	public Double recuperarSaldo() {
		return getSaldo();
	}

	@Override
	public String toString() {
		return "ContaSalario [qtdSaque=" + qtdSaque + super.toString() + "]";
	}

}
