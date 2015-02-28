package br.com.treinar.itau.modelo;

import br.com.treinar.itau.modelo.principal.Conta;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(Integer numeroConta) {
		super(numeroConta);
	}
	
	public Double tarifa;
	public Double limiteCredito;
	
	@Override
	public Double recuperarSaldo() {
		return saldo + limiteCredito;
	}
	
}
