package br.com.treinar.bb.modelo;

import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.modelo.banco.IPagavel;
import br.com.treinar.bb.modelo.exception.SaldoInsuficienteException;
import br.com.treinar.bb.modelo.exception.SaldoNaoDisponivelException;
import br.com.treinar.bb.modelo.exception.ValorInvalidoException;

public class ContaCorrente extends Conta implements IPagavel {

	private Double limiteCredito;
	private Double taxaManutencao;

	@Override
	public void sacar(Double valor) throws SaldoInsuficienteException, ValorInvalidoException {
		Double novoSaldo = 0d;
		validarValorSaque(valor);
		if (valor <= getSaldo()) {
			novoSaldo = getSaldo();
			novoSaldo -= valor;
			setSaldo(novoSaldo);
		} else if (valor <= (getSaldo() + limiteCredito)) {
			novoSaldo = getSaldo();
			setSaldo(0d);
			limiteCredito -= (valor - novoSaldo);
		} else {
			SaldoInsuficienteException exception = new SaldoInsuficienteException();
			exception.setSaldoDisponivel(getSaldo() + limiteCredito); 
			throw exception;			
		}
	}

	private void validarValorSaque(Double valor) throws ValorInvalidoException {
		if (valor < 0) {
			throw new ValorInvalidoException();
		}
	}

	public Double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	@Override
	public Double recuperarSaldo() throws SaldoNaoDisponivelException {
		//de acordo com a regra subir o exception
		return getSaldo() + limiteCredito;
	}



	public Double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(Double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

	@Override
	public void pagar() {
		try {
			sacar(taxaManutencao);
		} catch (SaldoInsuficienteException e) {
			this.setStatusConta(StatusConta.BLOQUEADA);
		} catch (ValorInvalidoException e) {
			//notifica gerente;
		}
	}


}
