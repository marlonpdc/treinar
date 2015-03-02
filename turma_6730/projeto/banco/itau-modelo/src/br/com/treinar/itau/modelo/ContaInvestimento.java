package br.com.treinar.itau.modelo;

import br.com.treinar.itau.modelo.banco.Conta;
import br.com.treinar.itau.modelo.banco.ICaptalizavel;
import br.com.treinar.itau.modelo.banco.ITarifavel;

public class ContaInvestimento extends Conta implements ICaptalizavel, ITarifavel {

	public Double taxaRendimento;
	public Double tarifa;

	@Override
	public Double recuperarSaldo() {
		return saldo;
	}

	@Override
	public void captalizar() {
		depositar(recuperarSaldo() * 0.1);
	}

	@Override
	public void calcularTarifa() {
		sacar(tarifa);
	}
	
	
}
