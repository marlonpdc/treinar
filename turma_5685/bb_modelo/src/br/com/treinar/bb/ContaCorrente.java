package br.com.treinar.bb;

import br.com.treinar.bb.banco.Conta;
import br.com.treinar.bb.banco.ITributavel;

public class ContaCorrente extends Conta implements ITributavel {

	private static final long serialVersionUID = 1L;
	private Double tarifa;
	private Double limiteCredito;
	
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
		if (limiteCredito != null && limiteCredito < 10000) {
			this.limiteCredito = limiteCredito;			
		}
	}

	@Override
	public void tributar() {
		saldo -= tarifa;
	}

}
