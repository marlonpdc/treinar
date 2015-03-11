package br.com.treinar.itau.modelo;

import br.com.treinar.itau.modelo.banco.Conta;
import br.com.treinar.itau.modelo.banco.INotificavel;
import br.com.treinar.itau.modelo.banco.ITarifavel;
import br.com.treinar.itau.modelo.banco.ItauException;
import br.com.treinar.itau.modelo.util.ItauConstante;
import br.com.treinar.itau.modelo.util.ItauUtil;

public class ContaCorrente extends Conta implements ITarifavel, INotificavel {

	public Double tarifa;
	public Double limiteCredito;
	
	@Override
	public Double recuperarSaldo() {
		return saldo + limiteCredito;
	}

	@Override
	public void cobrarTarifa() {
		try {
			sacar(tarifa);
		} catch (ItauException e) {
			ItauUtil.getInstance().notificarGerencia(this);
		}
	}

	@Override
	public String getEmail() {
		return ItauConstante.ItauConstanteModelo.EMAIL_CONTA_CORRENTE;
	}

	@Override
	public String getMensagem() {
		return ItauConstante.ItauConstanteModelo.MENSAGEM_CONTA_CORRENTE;
	}
	
}
