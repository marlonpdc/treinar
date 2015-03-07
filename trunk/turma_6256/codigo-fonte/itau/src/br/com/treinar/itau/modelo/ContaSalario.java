package br.com.treinar.itau.modelo;

import java.util.Date;

import br.com.treinar.itau.modelo.principal.Conta;

public class ContaSalario extends Conta {

	public Date dataCreditoSalario;
	
	public ContaSalario(Integer numeroConta) {
		super(numeroConta);
	}
		
}
