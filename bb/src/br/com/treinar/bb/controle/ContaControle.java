package br.com.treinar.bb.controle;

import br.com.treinar.bb.modelo.banco.BBException;
import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.modelo.banco.ContaBloqueadaException;
import br.com.treinar.bb.modelo.banco.SaldoInsuficienteException;
import br.com.treinar.bb.servico.ContaService;

/**
 * 
 * Esta classe atua na integracao entre as camadas de 
 * visao e de modelo
 * 
 * @author ADM
 * @since 20/07/2015
 */
public class ContaControle {

	private ContaService service = new ContaService();
	
	/**
	 * 
	 * Metodo para gravar contas no banco
	 * 
	 * @param conta Conta a ser gravada
	 * @throws BBException
	 */
	public void gravarConta(Conta conta) throws BBException {
		service.gravarConta(conta);
	}
	
	public Conta recuperarConta(Long codigoConta) {
		return service.recuperarConta(codigoConta);
	}

	public Conta[] recuperarContas() {
		return service.recuperarContas();
	}

	public void efetuarCaptalizacao() {
		service.captalizar();
	}

	public void efetuarPagamento() {
		service.pagar();
	}

	public void atualizarSituacaoConta(Conta conta, Integer opcao) {
		service.atualizarConta(conta, opcao);
	}

	public void efetuarSaque(Conta conta, Double valor) throws SaldoInsuficienteException, ContaBloqueadaException, BBException {
		service.sacar(conta, valor);
	}
	
	public void finalizar() {
		service.finalizarOperacoesBanco();
	}
	
//	public boolean editarConta(Conta conta) {
//		ContaService service = new ContaService();
//		return service.gravarConta(conta);
//	}
	
}
