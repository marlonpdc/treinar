package br.com.treinar.bradesco;

import br.com.treinar.bradesco.banco.Conta;
import br.com.treinar.bradesco.banco.ITarifavel;
import br.com.treinar.bradesco.banco.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements ITarifavel {

	private Double tarifa;
	
	private Double limiteCredito;
	//private Integer qtdSaque;
	
	public ContaCorrente() {
		super();
		limiteCredito = 100d;
	}

	public Double getTarifa() {
		return tarifa;
	}

	public void setTarifa(Double tarifa) {
		this.tarifa = tarifa;
	}

	public Double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	@Override
	public Double recuperarSaldo() {
		return saldo + limiteCredito;
	}

	@Override
	public void sacar(Double valor) throws SaldoInsuficienteException {
		if (saldo >= (valor + limiteCredito)) {
			if (saldo >= valor) {
				saldo -= valor;
			} else {
				limiteCredito -= valor - saldo;
				saldo = 0d;
			}
		} else {
			SaldoInsuficienteException sie = new SaldoInsuficienteException();
			sie.setCausa("O Cliente não possui saldo suficiente para executar a flkjaçlsdf");
			
			throw sie; 
		}
	}

	@Override
	public void tarifar() throws SaldoInsuficienteException {
		sacar(12D);
	}
	
}
