package br.com.treinar.bradesco.teste;

import br.com.treinar.bradesco.ContaPoupanca;

public class TesteStatic {

	public static void main(String[] args) {
		//ContaPoupanca cp = new ContaPoupanca();
		
		//O ideal eh acessar a partir da classe
		//cp.setTaxaRendimento(0.52);
		
		
		ContaPoupanca.setTaxaRendimento(0.528);

		
		
	}
	
}
