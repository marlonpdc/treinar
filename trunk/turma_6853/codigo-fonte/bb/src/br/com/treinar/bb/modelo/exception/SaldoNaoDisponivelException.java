package br.com.treinar.bb.modelo.exception;

public class SaldoNaoDisponivelException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Double saldoDisponivel;

	public Double getSaldoDisponivel() {
		return saldoDisponivel;
	}

	public void setSaldoDisponivel(Double saldoDisponivel) {
		this.saldoDisponivel = saldoDisponivel;
	}
}
