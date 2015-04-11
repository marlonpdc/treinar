package br.com.treinar.itau.controle;

import br.com.treinar.itau.exception.ContaNaoCadastradaException;
import br.com.treinar.itau.modelo.principal.Conta;

public interface IControle {

	void salvarConta(Conta conta);

	Conta recuperarConta(Integer numeroConta) throws ContaNaoCadastradaException;

	void removerConta(Conta conta);

	Conta[] recuperarContas();

	void persistir();

}
