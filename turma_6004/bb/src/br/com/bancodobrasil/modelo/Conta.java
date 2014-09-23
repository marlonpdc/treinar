package br.com.bancodobrasil.modelo;

public class Conta {

	public Long numeroConta;
	public double saldo;
	public Cliente proprietario;
	
	public Conta(double saldo ) {
		this();
		depositar(saldo);
	}
	public Conta(double saldo, Long numero ) {
		this(saldo);
	}
	public Conta() {
		saldo = 0;
		System.out.println("Inicializando construtor padrão");
	}
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public double recuperarSaldo() {
		return saldo;
	}
	
	
}
