package br.com.treinar.bradesco;

import java.util.Calendar;

import br.com.treinar.bradesco.banco.Conta;

public class ContaPoupanca extends Conta {

	private Integer diaRendimento;
	
	private static Double taxaRendimento;
	
	@Override
	public Double recuperarSaldo() {
		return saldo;
	}

	public Integer getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(Integer diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	@Override
	public void depositar(Double valor) {
		this.diaRendimento = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);	
		super.depositar(valor);
	}

	@Override
	public Boolean sacar(Double valor) {
		Boolean sacou = Boolean.FALSE;
		if (valor >= saldo) {
			saldo -= valor;
		}
		return sacou;
	}

	public static Double getTaxaRendimento() {
		return taxaRendimento;
	}

	public static void setTaxaRendimento(Double taxaRendimento) {
		ContaPoupanca.taxaRendimento = taxaRendimento;
	}

}
