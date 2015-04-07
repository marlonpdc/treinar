package br.com.treinar.bb.modelo;

import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.modelo.banco.ICaptalizavel;
import br.com.treinar.bb.modelo.banco.IPagavel;
import br.com.treinar.bb.modelo.exception.SaldoNaoDisponivelException;

public class ContaInvestimento extends Conta implements IPagavel, ICaptalizavel {

	private Double taxaRendimento;
	private Double taxaManutencao;

	public Double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(Double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
	
	@Override
	public void sacar(Double valor) {
		if (getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
		}
	}
	
	@Override
	public Double recuperarSaldo() throws SaldoNaoDisponivelException{
		return getSaldo();
	}

	public Double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(Double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

	@Override
	public void captalizar() {
		depositar(getSaldo() * taxaRendimento);
	}

	@Override
	public void pagar() {
		sacar(taxaManutencao);
	}
	
	
}
