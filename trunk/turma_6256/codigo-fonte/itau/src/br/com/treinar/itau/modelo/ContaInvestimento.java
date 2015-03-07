package br.com.treinar.itau.modelo;

import br.com.treinar.itau.modelo.principal.Conta;
import br.com.treinar.itau.modelo.principal.ICaptalizavel;
import br.com.treinar.itau.modelo.principal.ITributavel;

public class ContaInvestimento extends Conta implements ICaptalizavel, ITributavel {

	public Double tarifa;
	public Integer fatorCaptalizacao;
	
	public ContaInvestimento(Integer numeroConta) {
		super(numeroConta);
	}
	
	@Override
	public Double recuperarSaldo() {
		return saldo;
	}

	@Override
	public void tributar() {
		sacar(tarifa, Boolean.TRUE);
	}

	@Override
	public void captalizar() {
		depositar(saldo * (fatorCaptalizacao / 100));
	}

}
