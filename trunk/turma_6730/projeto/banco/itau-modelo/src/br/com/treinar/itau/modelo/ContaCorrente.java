package br.com.treinar.itau.modelo;

import br.com.treinar.itau.modelo.banco.Conta;

public class ContaCorrente extends Conta {

	public Double tarifa;
	public Double limiteCredito;
	
	@Override
	public Double recuperarSaldo() {
		return saldo + limiteCredito;
	}
	
	
}
