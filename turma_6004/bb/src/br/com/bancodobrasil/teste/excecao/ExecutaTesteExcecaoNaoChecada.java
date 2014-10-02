package br.com.bancodobrasil.teste.excecao;

import br.com.bancodobrasil.teste.encapsulamento.Pessoa;

public class ExecutaTesteExcecaoNaoChecada {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		while(true) {
			
				p.tomarBanho();
				
			System.out.println("chegou aqui");
		}
	}
	
}
