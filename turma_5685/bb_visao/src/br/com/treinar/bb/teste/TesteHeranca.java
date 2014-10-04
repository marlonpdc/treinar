package br.com.treinar.bb.teste;

import br.com.treinar.bb.ContaCorrente;
import br.com.treinar.bb.ContaPoupanca;
import br.com.treinar.bb.banco.Conta;

public class TesteHeranca {

	public static void main(String[] args) {
		//nao pode ser instanciada pois conta eh abstrata
		//Conta c = new Conta();
		Conta cc = new ContaCorrente();
		cc.saldo = 1500d;
		
		//nao eh possivel pois a classe ContaCorrente tem mais caracteristicas
		//e funcionalidades do que a classe conta e a partir de uma instancia de Conta
		//estas nao seriam representadas
		//ContaCorrente cTemp = new Conta();
		
		((ContaCorrente)cc).tarifa = 10d;
		
		Conta cp = new ContaPoupanca();
		cp.saldo = 4522d;
	}
	
}
