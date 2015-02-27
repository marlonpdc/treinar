package br.com.treinar.itau.modelo;

import java.util.Date;

public class Conta {

	public Integer numeroConta;
	public Pessoa pessoa;
	public Double saldo;
	
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
		Boolean deuCerto = Boolean.TRUE;
		//regra para deopositar
		saldo += valor;		
		return deuCerto;
	}
	
	
	public Boolean sacar(Double valor) {
		Boolean sacou = Boolean.FALSE;
		if (saldo >= valor) {
			saldo -= valor;
			sacou = Boolean.TRUE;
		}
		return sacou;
		
	}
	
}
