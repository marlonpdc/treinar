package br.com.treinar.itau.modelo.banco;

import java.util.Date;

public abstract class Conta {

	public Integer numeroConta;
	public Pessoa pessoa;
	protected Double saldo;
	
	public Conta(Pessoa pessoa) {
		this();
		this.pessoa = pessoa;
	}
	
	public Conta() {
		pessoa = new Pessoa();
		this.saldo = 0d;
	}
	
	public Boolean depositar(Double valor) {
		Boolean deuCerto = Boolean.TRUE;
		//regra para deopositar
		saldo += valor;		
		return deuCerto;
	}
	
	/**
	 * 
	 * Metodo responsavel por depositar valores em uma conta
	 * 
	 * 
	 * @param valor montante a ser depositado, serah acumulado ao saldo
	 * @param dataCredito - dia em que o credito serah efetivado
	 * @return verdadeir caso o deposito tenha sido efetivado e falso caso contrario
	 */
	public Boolean depositar(Double valor, Date dataCredito) {
		//qualquer regra com a data
		return this.depositar(valor);
	}
	
	
	public Boolean sacar(Double valor) {
		Boolean sacou = Boolean.FALSE;
		if (saldo >= valor) {
			saldo -= valor;
			sacou = Boolean.TRUE;
		}
		return sacou;
		
	}

	public abstract Double recuperarSaldo();
	
}
