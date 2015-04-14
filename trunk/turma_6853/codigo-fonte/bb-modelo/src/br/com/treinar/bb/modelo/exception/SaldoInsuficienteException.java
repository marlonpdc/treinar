package br.com.treinar.bb.modelo.exception;

public class SaldoInsuficienteException extends Exception {

	private static final long serialVersionUID = 494773160274912522L;
	
	private Double saldoDisponivel;

	public Double getSaldoDisponivel() {
		return saldoDisponivel;
	}

	public void setSaldoDisponivel(Double saldoDisponivel) {
		this.saldoDisponivel = saldoDisponivel;
	}

}
