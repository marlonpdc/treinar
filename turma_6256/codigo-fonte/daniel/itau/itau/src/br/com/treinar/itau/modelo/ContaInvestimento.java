package br.com.treinar.itau.modelo;

import java.util.Date;

import br.com.treinar.itau.modelo.principal.Conta;
import br.com.treinar.itau.modelo.principal.IInvestimento;

public class ContaInvestimento extends Conta implements IInvestimento {

	private Double tarifa;
	private Integer fatorCaptalizacao;
	private Date dataInicioInvestimento;
	
	public ContaInvestimento(Integer numeroConta) {
		super(numeroConta);
	}

	@Override
	public Double recuperarSaldo() {
		return saldo;
	}

	public Double getTarifa() {
		return tarifa;
	}

	public void setTarifa(Double tarifa) {
		this.tarifa = tarifa;
	}

	public Integer getFatorCaptalizacao() {
		return fatorCaptalizacao;
	}

	public void setFatorCaptalizacao(Integer fatorCaptalizacao) {
		this.fatorCaptalizacao = fatorCaptalizacao;
	}

	@Override
	public void tributar() {
		sacar(tarifa, Boolean.TRUE);
	}

	@Override
	public void captalizar() {
		depositar(saldo * (fatorCaptalizacao / 100));
	}

	@Override
	public Date getDataInicioInvestimento() {
		return dataInicioInvestimento;
	}
	
	public void setDataInicioInvestimento(Date dataInicioInvestimento) {
		this.dataInicioInvestimento = dataInicioInvestimento;
	}

}
