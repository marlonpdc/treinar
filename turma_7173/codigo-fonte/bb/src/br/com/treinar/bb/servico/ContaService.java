package br.com.treinar.bb.servico;

import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.util.Database;

public class ContaService {

	
	public Boolean gravarConta(Conta conta) {
		Database instance = Database.getInstance();
		Conta contaGravada = instance.getConta();
		Boolean gravado = Boolean.FALSE;
		if (contaGravada == null) {
			instance.setConta(conta);
			gravado = Boolean.TRUE;
			
		}
		return gravado;
	}
	
	public Conta recuperarConta() {
		return Database.getInstance().getConta();
	}
	
}
