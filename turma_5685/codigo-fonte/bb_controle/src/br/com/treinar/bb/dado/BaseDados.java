package br.com.treinar.bb.dado;

import br.com.treinar.bb.banco.Conta;
import br.com.treinar.enumerators.StatusConta;

public class BaseDados {

	private static BaseDados instance;
	private Conta[] contas;
	private Integer index;
	
	private BaseDados() {
		super();
		contas = new Conta[5];
		index = 0;
	}
	
	static {
		instance = new BaseDados();
	}
	
	public static BaseDados getInstance() {
		return instance;
	}
	
	public void adicionarConta(Conta conta) {
		contas[index++] = conta;
	}
	
	public Conta[] recuperarContas() {
		return contas;
	}

	public Conta recuperarContaPorCodigo(Long codigo) {
		Conta c = null;
		for (int i = 0; i < contas.length; i++) {
			if (contas[i].getCliente().equals(codigo)) {
				c = contas[i];
				break;
			}
		}
		return c;
	}
	
	public void excluirConta(Long codConta) {
		
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null && contas[i].getCodigo().equals(codConta)) {
				contas[i].setStatusConta(StatusConta.INATIVO);
				break;
			}
		}
	}

}
