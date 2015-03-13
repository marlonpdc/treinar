package br.com.treinar.itau.modelo;

import java.util.Date;

import br.com.treinar.itau.modelo.principal.Conta;

public class ContaSalario extends Conta {

	private Date dataCreditoSalario;
	
	public Date getDataCreditoSalario() {
		return dataCreditoSalario;
	}

	public void setDataCreditoSalario(Date dataCreditoSalario) {
		this.dataCreditoSalario = dataCreditoSalario;
	}

	public ContaSalario(Integer numeroConta) {
		super(numeroConta);
	}
	
	@Override
	public Double recuperarSaldo() {
		return saldo;
	}
}
