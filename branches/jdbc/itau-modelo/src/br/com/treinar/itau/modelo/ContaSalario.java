package br.com.treinar.itau.modelo;

import java.util.Date;

import br.com.treinar.itau.modelo.principal.Conta;

public class ContaSalario extends Conta {

	private static final long serialVersionUID = -4470723479510969569L;

	public Date dataCreditoSalario;
	
	public ContaSalario(Integer numeroConta) {
		super(numeroConta);
	}
	
	@Override
	public Double recuperarSaldo() {
		return getSaldo();
	}
}
