package br.com.treinar.bb.modelo;

import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.modelo.banco.IPagavel;

public class ContaCorrente extends Conta implements IPagavel {

	private Double limiteCredito;
	private Double taxaManutencao;
	
	@Override
	public void sacar(Double valor) {
		Double novoSaldo = 0d;
		if (valor <= getSaldo()) {
			novoSaldo = getSaldo();
			novoSaldo -= valor;
			setSaldo(novoSaldo);
		} else if (valor <= (getSaldo() + limiteCredito)) {
				novoSaldo = getSaldo();
				setSaldo(0d);
				limiteCredito -= (valor - novoSaldo);
			
		}
	}

	public Double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	@Override
	public Double recuperarSaldo() {
		return getSaldo() + limiteCredito;
	}

	
	
	public Double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(Double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

	@Override
	public void pagar() {
		sacar(taxaManutencao);
	}
	

}
