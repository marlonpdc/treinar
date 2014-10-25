package br.com.treinar.bb.dado;

import java.util.ArrayList;
import java.util.List;

import br.com.treinar.bb.ContaCorrente;
import br.com.treinar.bb.banco.Conta;
import br.com.treinar.enumerators.StatusConta;

public class BaseDados {

	private static BaseDados instance;
	private List<Conta> contas;
	
	private BaseDados() {
		super();
		contas = new ArrayList<>();
	}
	
	static {
		instance = new BaseDados();
	}
	
	public static BaseDados getInstance() {
		return instance;
	}
	
	public void adicionarConta(Conta conta) {
		if (!contas.contains(conta)) {
			contas.add(conta);
		}
		//TODO aula de 1/11/2014 exception
	}
	
	public List<Conta> recuperarContas() {
		List<Conta> contasValidas = new ArrayList<>();
		for (Conta conta : contas) {
			if (conta.getStatusConta().equals(StatusConta.ATIVO)) {
				contasValidas.add(conta);
			}
		}
		return contasValidas;
	}

	public Conta recuperarContaPorCodigo(Long codigo) {
		Conta conta = new ContaCorrente();
		conta.setCodigo(codigo);
		Integer index = contas.indexOf(conta);
		return index != null ? contas.get(index) : null;
	}
	
	public void excluirConta(Long codConta) {
		
		Conta c = recuperarContaPorCodigo(codConta);
		if (c != null) {
			c.setStatusConta(StatusConta.INATIVO);			
		}
		//TODO tratar excecao
		
	}

}
