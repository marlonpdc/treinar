package br.com.treinar.itau.modelo;

import br.com.treinar.itau.exception.SaldoInsuficienteException;
import br.com.treinar.itau.modelo.principal.Conta;
import br.com.treinar.itau.modelo.principal.ITributavel;

public class ContaCorrente extends Conta implements ITributavel {
	
	private static final long serialVersionUID = -1290654324512497233L;

	private Double tarifa;
	private Double limiteCredito;
	private Double limiteCreditoUsado;
	
	public ContaCorrente(Integer numeroConta) {
		super(numeroConta);
		limiteCreditoUsado = 0d;
	}
	
	@Override
	public Double recuperarSaldo() {
		return getSaldo() + limiteCredito;
	}

	@Override
	public void tributar() {
		try {
			sacar(tarifa, Boolean.TRUE);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Enviar boleto para: " + this.getPessoa().getClass());
		}
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
	
	/**
	 * Efetua o saque, removendo o valor informado no parametro do saldo da
	 * conta
	 * 
	 * @param valor
	 *            valor a resr removido da conta
	 * @return verdadeiro se o saque for efetuado e falso se não for possível
	 *         sacar
	 */
	public void sacar(Double valor) throws SaldoInsuficienteException {
		if (this.getSaldo() >= valor) {
			this.setSaldo(getSaldo() - valor);
		} else if((getSaldo() + limiteCredito) >= valor) {
			limiteCreditoUsado -= getSaldo();
			setSaldo(0D);
		} else {
			SaldoInsuficienteException sie = new SaldoInsuficienteException();
			throw sie;
		}
	}
	
	
	@Override
	public void depositar(Double valor) {
		if (limiteCreditoUsado < limiteCredito) {
			if (valor <= (limiteCredito - limiteCreditoUsado)) {
				limiteCreditoUsado += valor;
			} else {
				Double temp = limiteCredito - limiteCreditoUsado;
				limiteCreditoUsado = limiteCredito;
				depositar(temp);
			}
		}
		super.depositar(valor);
	}

}
