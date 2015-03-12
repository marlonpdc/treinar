package br.com.treinar.itau.controle;

import java.io.IOException;

import br.com.treinar.itau.modelo.banco.Conta;
import br.com.treinar.itau.modelo.banco.ItauException;
import br.com.treinar.itau.modelo.util.ItauUtil;

public class ContaControle {

	private ItauUtil utilitario;
	
	public ContaControle() {
		utilitario = ItauUtil.getInstance();
	}
	
	public Boolean gravarConta(Conta conta) {
		return utilitario.adicionarConta(conta);
	}
	
	public Conta recuperarConta(Integer numeroConta) throws ItauException {
		return utilitario.recuperarConta(numeroConta);
	}

	public void tarifarContas() {
		utilitario.tarifarContas();
	}

	public void captalizarContas() {
		utilitario.captalizarContas();
	}

	public Conta[] recuperarContas() {
		return utilitario.recuperarContas();
	}

	public void deletarConta(Conta conta) {
		utilitario.deletarConta(conta);			
	}

	public void efetuarSaque(Conta conta, Double valorSaque) throws ItauException {

		conta.sacar(valorSaque);
		
	}

	public void persistir() throws IOException {
		utilitario.gravarContas();
	}

	public void carregarContas() throws IOException {
		utilitario.carregarContas();
	}
	
}
