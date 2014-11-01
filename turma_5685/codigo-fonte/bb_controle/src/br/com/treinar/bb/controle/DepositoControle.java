package br.com.treinar.bb.controle;

import br.com.treinar.bb.banco.Conta;
import br.com.treinar.bb.dado.BaseDados;
import br.com.treinar.bb.exception.BBException;
import br.com.treinar.enumerators.StatusConta;

public class DepositoControle {
	
	public void depositar(Long codigo, Double valor) throws BBException {
		Conta conta = BaseDados.getInstance().recuperarContaPorCodigo(codigo);
		if (conta.getStatusConta().equals(StatusConta.ATIVO)) {
			conta.depositar(valor);
		} else {
			BBException e = new BBException("Conta nao pode estar " + conta.getStatusConta().getDescricao());
			throw e;
		}
		
	}
	
}
