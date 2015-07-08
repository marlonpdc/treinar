package br.com.treinar.bb.modelo;

import br.com.treinar.bb.modelo.banco.Conta;

public class ContaSalario extends Conta {

	private int qtdSaque;

	public int getQtdSaque() {
		return qtdSaque;
	}

	public void setQtdSaque(int qtdSaque) {
		this.qtdSaque = qtdSaque;
	}

}
