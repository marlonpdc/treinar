package br.com.treinar.bradesco.teste;

import br.com.treinar.bradesco.ContaCorrente;
import br.com.treinar.bradesco.ContaPoupanca;
import br.com.treinar.bradesco.banco.Conta;
import br.com.treinar.bradesco.banco.SaldoInsuficienteException;

public class TestePolimorfismo {

	public static void main(String[] args) {
		Conta conta = null;

		conta = new ContaPoupanca();
		conta.setNumeroConta(1048L);
		conta.depositar(100d);
		

		try {
			conta.sacar(50d);
			System.out.println("Sacou!!!");
		} catch (SaldoInsuficienteException e) {
			System.out.println("Nao sacou!!!");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException b) {
			System.out.println("ArrayIndexOf...");
		}finally {
			System.out.println("Obrigado!!!");
		}

		//String msg = sacou ? "Sacou!" : "Não Sacou!";


		conta = new ContaCorrente();
		conta.setNumeroConta(1049L);
		conta.depositar(1000d);
		
		ContaCorrente contaCorrente = (ContaCorrente)conta;
		
		contaCorrente.setLimiteCredito(100D);

		//sacou = conta.sacar(50d);
		
		//msg = sacou ? "Sacou!" : "Não Sacou!";

		//System.out.println(msg);
	}

}
