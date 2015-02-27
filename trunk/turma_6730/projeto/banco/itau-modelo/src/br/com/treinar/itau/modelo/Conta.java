package br.com.treinar.itau.modelo;

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
	
	
}
