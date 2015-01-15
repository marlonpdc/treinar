package br.com.treinar.bradesco.banco;

import br.com.treinar.bradesco.ContaPoupanca;


public class BradescoUtil {
	
	private static BradescoUtil instance;
	
	private Banco banco;
	
	private BradescoUtil() {
		super();
		banco = new Banco();
	}
	
	static {
		instance = new BradescoUtil();
	}
	
	public static BradescoUtil getInstance() {
		return instance;
	}
	
	public Integer soma(Integer a, Integer b) {
		return a + b;
	}

	public Boolean adicionarConta(Conta c) {
		return banco.adicionarConta(c);
	}
	
	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Conta recuperarConta(Long numeroConta) {
		Conta conta = null;
		Conta[] contas = banco.getContas();

		for (int i = 0; i < contas.length; i++) {
			if (contas[i].getNumeroConta().equals(numeroConta)) {
				conta = contas[i];
				break;
			}
		}			
		
		return conta;
	}

}
