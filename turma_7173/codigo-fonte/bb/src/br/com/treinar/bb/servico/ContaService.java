package br.com.treinar.bb.servico;

import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.util.Database;

public class ContaService {

	
	public Boolean gravarConta(Conta conta) {
		Database instance = Database.getInstance();
		return instance.inserirConta(conta);
	}
	
	public Conta recuperarConta(Long codigoConta) {
		return Database.getInstance().selecionar(codigoConta);
	}
	
}
