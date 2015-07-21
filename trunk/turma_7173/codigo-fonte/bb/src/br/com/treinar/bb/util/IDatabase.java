package br.com.treinar.bb.util;

import br.com.treinar.bb.modelo.banco.BBException;
import br.com.treinar.bb.modelo.banco.Conta;

public interface IDatabase {

	public void inserirConta(Conta conta) throws BBException;
	
	public Conta selecionar(Long codigoConta) throws BBException;
	
	public Conta[] getContas() throws BBException;
	
	public void editarConta(Conta conta) throws BBException;
	
}
