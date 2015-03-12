package br.com.treinar.itau.modelo;

import br.com.treinar.itau.modelo.banco.Conta;
import br.com.treinar.itau.modelo.banco.ICaptalizavel;
import br.com.treinar.itau.modelo.banco.ITarifavel;
import br.com.treinar.itau.modelo.banco.ItauException;

public class ContaInvestimento extends Conta implements ICaptalizavel, ITarifavel {

	public Double taxaRendimento;
	public Double tarifa;

	@Override
	public Double recuperarSaldo() {
		return saldo;
	}

	@Override
	public void captalizar() {
		depositar(recuperarSaldo() * (taxaRendimento / 100));
	}

	@Override
	public void cobrarTarifa() {
		try {
			sacar(recuperarSaldo() * (tarifa / 100));
		} catch (ItauException e) {
			
		}
	}
	
}
