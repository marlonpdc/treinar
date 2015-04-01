package br.com.treinar.bb.modelo;

import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.modelo.banco.ICaptalizavel;

public class ContaPoupanca extends Conta implements ICaptalizavel {

	private static Double taxaRendimento;
	private Integer diaBase;

	public static Double getTaxaRendimento() {
		return taxaRendimento;
	}

	public static void setTaxaRendimento(Double taxaRendimento) {
		ContaPoupanca.taxaRendimento = taxaRendimento;
	}
	
	public Integer getDiaBase() {
		return diaBase;
	}

	public void setDiaBase(Integer diaBase) {
		this.diaBase = diaBase;
	}

	@Override
	public void sacar(Double valor) {
		if (getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
		}
	}
	
	@Override
	public Double recuperarSaldo() {
		return getSaldo();
	}

	@Override
	public void captalizar() {
		depositar(getSaldo() * taxaRendimento);
	}
}
