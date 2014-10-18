package br.com.treinar.bb;

import br.com.treinar.bb.banco.Conta;
import br.com.treinar.bb.banco.ICaptalizavel;

public class ContaPoupanca extends Conta implements ICaptalizavel {

	private static final long serialVersionUID = 1L;
	
	private static Double taxaRendimento;

	static {
		taxaRendimento = 0d;
	}
	
	@Override
	public Double recuperarSaldo() {
		return saldo;
	}

	@Override
	public Boolean sacar(Double valor) {
		Boolean sacou = Boolean.FALSE;
		if (saldo >= valor) {
			saldo = saldo - valor;
			sacou = Boolean.TRUE;
		}
		return sacou;
	}

	public static Double getTaxaRendimento() {
		return taxaRendimento;
	}

	public static void setTaxaRendimento(Double taxaRendimento) {
		ContaPoupanca.taxaRendimento = taxaRendimento;
	}

	@Override
	public void captalizar() {
		saldo *= (taxaRendimento + 1);
	}

}
