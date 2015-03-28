package br.com.treinar.itau.modelo;

import br.com.treinar.itau.exception.SaldoInsuficienteException;
import br.com.treinar.itau.modelo.principal.Conta;
import br.com.treinar.itau.modelo.principal.ITributavel;

public class ContaCorrente extends Conta implements ITributavel {
	
	public ContaCorrente(Integer numeroConta) {
		super(numeroConta);
	}
	
	public Double tarifa;
	public Double limiteCredito;
	
	@Override
	public Double recuperarSaldo() {
		return saldo + limiteCredito;
	}

	@Override
	public void tributar() {
		try {
			sacar(tarifa, Boolean.TRUE);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Enviar boleto para: " + this.pessoa.nome);
		}
	}

}
