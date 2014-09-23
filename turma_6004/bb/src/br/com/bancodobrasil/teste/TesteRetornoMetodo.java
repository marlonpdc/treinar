package br.com.bancodobrasil.teste;


public class TesteRetornoMetodo {

	public static void main(String[] args) {
		Metodo metodo = new Metodo();
		metodo.variavel = "variavel ";
		String atr = metodo.variavel;
		System.out.println(atr);
		metodo.metodoUm();
		metodo.metodoDois();
		
		System.out.println("im");
		
	}
	
}
