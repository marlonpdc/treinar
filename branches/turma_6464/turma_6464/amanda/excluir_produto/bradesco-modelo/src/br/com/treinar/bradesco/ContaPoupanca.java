package br.com.treinar.bradesco;

import java.util.Calendar;

import br.com.treinar.bradesco.banco.Conta;
import br.com.treinar.bradesco.banco.ICaptalizavel;
import br.com.treinar.bradesco.banco.SaldoInsuficienteException;

public class ContaPoupanca extends Conta implements ICaptalizavel {

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
	public void sacar(Double valor) throws SaldoInsuficienteException {
		if (valor >= saldo) {
			saldo -= valor;
		} else {
			throw new SaldoInsuficienteException();
		}
	}

	public static Double getTaxaRendimento() {
		return taxaRendimento;
	}

	public static void setTaxaRendimento(Double taxaRendimento) {
		ContaPoupanca.taxaRendimento = taxaRendimento;
	}

	@Override
	public void captalizar() {
		depositar(getSaldo() * taxaRendimento); 
	}

}
