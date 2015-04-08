package br.com.treinar.bb.modelo;

import br.com.treinar.bb.modelo.banco.Conta;
import br.com.treinar.bb.modelo.banco.ICaptalizavel;
import br.com.treinar.bb.modelo.banco.IPagavel;
import br.com.treinar.bb.modelo.exception.NenhumaContaCadastradaException;

public class BBUtil {
	
	
	private Conta[] contas;
	private Integer index;

	private static BBUtil instance;
	
	private BBUtil() {
		index = 0;
		contas = new Conta[10];
	}
	
	static {
		instance = new BBUtil();
	}
	
	public static BBUtil getInstance() {
		return instance;
	}

	public Conta[] getContas() {
		return contas;
	}

	public void setContas(Conta[] contas) {
		this.contas = contas;
	}
	
	
	public void adicionarConta(Conta c) throws SemDisponibilidadeException {
		if (index < contas.length) {
			c.setStatusConta(StatusConta.ATIVA);
			this.contas[index++] = c;			
		}
	}

	public Conta recuperarConta(Long id) throws ContaNaoCadastradaException {
		Conta c = null;
		for (Conta conta : contas) {
			if (conta.getId().equals(id)) {
				c = conta;
				break;
			}
		}
		if (c == null) {
			throw new ContaNaoCadastradaException();
		}
		return c;
	}

	public void captalizar() {
		for (Conta conta : contas) {
			if (conta instanceof ICaptalizavel) {
				captalizar((ICaptalizavel)conta);
			}
		}
	}
	
	private void captalizar(ICaptalizavel captalizavel) {
		captalizavel.captalizar();
	}

	public void cobrarTarifa() {
		for (Conta conta : contas) {
			if (conta instanceof IPagavel) {
				tarifar((IPagavel)conta);
			}
		}
	}

	private void tarifar(IPagavel pagavel) {
		pagavel.pagar();
	}
	
	public Conta[] recuperarContas() throws NenhumaContaCadastradaException {
		return contas;
	}

}
