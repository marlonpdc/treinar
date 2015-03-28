package br.com.treinar.itau.modelo;

import java.util.Date;

import br.com.treinar.itau.exception.SaldoInsuficienteException;
import br.com.treinar.itau.modelo.principal.Conta;
import br.com.treinar.itau.modelo.principal.IInvestimento;

public class ContaInvestimento extends Conta implements IInvestimento {

	public Double tarifa;
	public Integer fatorCaptalizacao;
	private Date dataInicioInvestimento;
	
	public ContaInvestimento(Integer numeroConta) {
		super(numeroConta);
	}

	@Override
	public Double recuperarSaldo() {
		return saldo;
	}

	@Override
	public void tributar() {
		try {
			sacar(tarifa, Boolean.TRUE);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Enviar boleto para: " + this.pessoa.nome);
		}
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
