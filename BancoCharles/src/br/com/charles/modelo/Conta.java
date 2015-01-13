package br.com.charles.modelo;

public class Conta {
	
	Double saldo;
	Double limite;
	Integer numero;
	
	Agencia agencia;
	
	public void deposita(double valor){
		
		this.saldo += valor;
	}
	
	public void sacar(double valor){
		
		this.saldo -= valor;
	}
	
	public double consultasaldo(){
		
		return this.saldo + this.limite;
	}

}
