package br.com.treinar.bradesco;

import br.com.treinar.bradesco.banco.Conta;

public class ContaCorrente extends Conta {

	private Double tarifa;
	
	private Double limiteCredito;

	public Double getTarifa() {
		return tarifa;
	}

	public void setTarifa(Double tarifa) {
		this.tarifa = tarifa;
	}

	public Double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	@Override
	public Double recuperarSaldo() {
		return saldo + limiteCredito;
	}
	
}
