package br.com.treinar.bb.modelo;

import br.com.treinar.bb.modelo.banco.BBException;
import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.modelo.banco.ICaptalizavel;
import br.com.treinar.bb.modelo.banco.IPagavel;
import br.com.treinar.bb.modelo.banco.SaldoInsuficienteException;

public class ContaInvestimento extends Conta implements ICaptalizavel, IPagavel {

	private static final long serialVersionUID = 1L;

	private Integer rentabilidade;

	private Double taxaManutencao;

	public Integer getRentabilidade() {
		return rentabilidade;
	}

	public void setRentabilidade(Integer rentabilidade) {
		this.rentabilidade = rentabilidade;
	}

	public Double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(Double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

	@Override
	public void sacar(Double valor) throws SaldoInsuficienteException {
		Double saldo = getSaldo();
		if (saldo >= valor + 10) {
			setSaldo(saldo - (valor + 10));
		} else {
			throw new SaldoInsuficienteException();
		}
	}

	@Override
	public Double recuperarSaldo() {
		return getSaldo();
	}

	@Override
	public String toString() {
		return "ContaInvestimento [rentabilidade=" + rentabilidade
				+ ", taxaManutencao=" + taxaManutencao + super.toString() + "]";
	}
	@Override
	public void captalizar() {
		try {
			depositar(getSaldo() * ContaPoupanca.getTaxaRendimento() / 100);
		} catch (BBException e) {
			System.err.println(e.getCodigoErroNegocio());
		}
	}
	
	@Override
	public void pagar() throws SaldoInsuficienteException {
		sacar(taxaManutencao);
	}
}
