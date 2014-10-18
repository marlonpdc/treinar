package br.com.treinar.bb.controle;



import br.com.treinar.bb.banco.Conta;
import br.com.treinar.bb.dado.BaseDados;

public class SaqueControle {
	
	public void sacarConta(Long codigo, Double valorSaque) {				
		Conta conta = BaseDados.getInstance().recuperarContaPorCodigo(codigo);
		conta.sacar(valorSaque);
	}
	
}
