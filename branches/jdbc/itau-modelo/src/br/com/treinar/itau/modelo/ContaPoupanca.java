package br.com.treinar.itau.modelo;

import br.com.treinar.itau.modelo.principal.Conta;
import br.com.treinar.itau.modelo.principal.ICaptalizavel;

public class ContaPoupanca extends Conta implements ICaptalizavel {

	private static final long serialVersionUID = -8088163426902591143L;
	
	public static Float taxaRendimento;
	public Integer diaBaseDeposito;

	static {
		taxaRendimento = Float.valueOf(19);
	}

	public static Float getTaxaRendimento() {
		return taxaRendimento;
	}

	public static void setTaxaRendimento(Float taxaRendimento) {
		ContaPoupanca.taxaRendimento = taxaRendimento;
	}

	public ContaPoupanca(Integer numeroConta) {
		super(numeroConta);
	}
	
	@Override
	public Double recuperarSaldo() {
		return getSaldo();
	}

	@Override
	public void captalizar() {
		depositar(getSaldo() * (taxaRendimento / 100));
	}

}
