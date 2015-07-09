package br.com.treinar.bb.servico;

import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.util.Database;

public class ContaService {

	
	public boolean gravarConta(Conta conta) {
		Database instance = Database.getInstance();
		Conta contaGravada = instance.getConta();
		boolean gravado = false;
		if (contaGravada == null) {
			instance.setConta(conta);
			gravado = true;
			
		}
		return gravado;
	}
	
	public Conta recuperarConta() {
		return Database.getInstance().getConta();
	}
	
}
