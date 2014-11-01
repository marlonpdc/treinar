package br.com.treinar.bb.controle;

import br.com.treinar.bb.banco.Conta;
import br.com.treinar.bb.dado.BaseDados;
import br.com.treinar.bb.exception.BBException;


public class SaldoControle {

	public Double recuperarSaldo(Long codigo) throws BBException {
		Conta conta = BaseDados.getInstance().recuperarContaPorCodigo(codigo);
		Double saldo;
		try {
			saldo = conta.recuperarSaldo();
			return saldo;
		} catch (BBException e) {
			e.setMsgErro("Saldo Insuficiente");
			throw e;
		}
	}          

}