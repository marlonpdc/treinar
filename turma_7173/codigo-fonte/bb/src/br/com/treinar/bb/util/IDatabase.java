package br.com.treinar.bb.util;

import br.com.treinar.bb.modelo.banco.Conta;

public interface IDatabase {

	public Boolean inserirConta(Conta conta);
	
	public Conta selecionar(Long codigoConta);
	
	public Conta[] getContas();
	
}
