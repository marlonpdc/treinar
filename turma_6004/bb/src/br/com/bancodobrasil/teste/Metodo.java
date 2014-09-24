package br.com.bancodobrasil.teste;

import br.com.bancodobrasil.modelo.Conta;

public class Metodo {

	public String variavel;
	
	public void metodoUm() {
		System.out.println("este é o retorno esperado por quem utilizar o metodoUm()");
	}
	public String metodoDois() {
		//alguma coisa
		String retorno = "depois do processamento eu fui retornada";
		return retorno;
	}
	
	public void metodoTres(Conta conta) {
		conta.depositar(1000);
	}
	
	
}
