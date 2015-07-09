package br.com.treinar.bb.modelo;

import br.com.treinar.bb.modelo.banco.Conta;

public class ContaPoupanca extends Conta {

	private static int taxaRendimento;
	
	public ContaPoupanca() {
		//nao deve ser feita a inicializacao neste 
		//ponto pois o atributo taxaRendimento é static esta atribuicao
		//implicaria em modificar o seu valor a cada vez que um objeto
		//da classe ContaPoupanca for criado...
		//taxaRendimento = 0;
	}
	
	static {
		taxaRendimento = 0;
	}
	
	public static int getTaxaRendimento() {
		return taxaRendimento;
	}

	public static void setTaxaRendimento(int taxaRendimento) {
		ContaPoupanca.taxaRendimento = taxaRendimento;
	}

	@Override
	public boolean sacar(double valor) {
		boolean saqueEfetuado = false;
		double saldo = getSaldo();
		if (saldo >= valor) {
			setSaldo(saldo - valor);
			saqueEfetuado = true;
		}
		return saqueEfetuado;
	}

	@Override
	public double recuperarSaldo() {
		return getSaldo();
	}
	
}
