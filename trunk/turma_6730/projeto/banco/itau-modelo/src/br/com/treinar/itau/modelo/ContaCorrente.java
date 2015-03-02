package br.com.treinar.itau.modelo;

import br.com.treinar.itau.modelo.banco.Conta;
import br.com.treinar.itau.modelo.banco.ITarifavel;

public class ContaCorrente extends Conta implements ITarifavel {

	public Double tarifa;
	public Double limiteCredito;
	
	@Override
	public Double recuperarSaldo() {
		return saldo + limiteCredito;
	}

	@Override
	public void calcularTarifa() {
		sacar(tarifa);
	}
	
	
}
