package br.com.treinar.bb;

import br.com.treinar.bb.banco.Conta;

public class ContaCorrente extends Conta {

	public Double tarifa;
	public Double limiteCredito;
	
	@Override
	public Double recuperarSaldo() {
		return saldo + limiteCredito;
	}

	//esta implementacao exige um if para avaliar a execucao da operacao
	@Override
	public Boolean sacar(Double valor) {
		Boolean sacou = Boolean.FALSE;
		if (saldo >= (valor + limiteCredito)) {
			sacou = Boolean.TRUE;
			if (saldo >= valor) {
				saldo -= valor;
			} else {
				limiteCredito -= valor;
				saldo = 0d;
			}
		}
		return sacou;
	}

}
