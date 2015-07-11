package br.com.treinar.bb.modelo;

import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.modelo.banco.ICaptalizavel;

public class ContaPoupanca extends Conta implements ICaptalizavel {

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
	public Boolean sacar(Double valor) {
		Boolean saqueEfetuado = Boolean.FALSE;
		Double saldo = getSaldo();
		if (saldo >= valor) {
			setSaldo(saldo - valor);
			saqueEfetuado = Boolean.TRUE;
		}
		return saqueEfetuado;
	}

	@Override
	public Double recuperarSaldo() {
		return getSaldo();
	}

	@Override
	public String toString() {
		return "ContaPoupanca [" + super.toString() + "]";
	}
	
	@Override
	public void captalizar() {
		depositar(getSaldo() * ContaPoupanca.getTaxaRendimento() / 100);
	}
}
