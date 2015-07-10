package br.com.treinar.bb.modelo;

import br.com.treinar.bb.modelo.banco.Conta;

public class ContaSalario extends Conta {

	private Integer qtdSaque;

	public Integer getQtdSaque() {
		return qtdSaque;
	}

	public void setQtdSaque(Integer qtdSaque) {
		this.qtdSaque = qtdSaque;
	}

	@Override
	public Boolean sacar(Double valor) {
		Boolean saqueEfetuado = Boolean.FALSE;
		Double saldo = getSaldo();
		if (saldo >= valor) {
			setSaldo(saldo - valor);
			saqueEfetuado = Boolean.TRUE;
		}
		return saqueEfetuado;
	}

	@Override
	public Double recuperarSaldo() {
		return getSaldo();
	}

}
