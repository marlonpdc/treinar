package br.com.treinar.itau.modelo.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.treinar.itau.modelo.banco.Conta;
import br.com.treinar.itau.modelo.banco.ICaptalizavel;
import br.com.treinar.itau.modelo.banco.INotificavel;
import br.com.treinar.itau.modelo.banco.ITarifavel;
import br.com.treinar.itau.modelo.banco.ItauException;


public class ItauUtil {

	private Conta[] contas;
	private Integer indice;
	private static ItauUtil instance;
	
	private ItauUtil() {
		super();
		contas = new Conta[5];
		indice = 0;
	}
	
	static {
		instance = new ItauUtil();
	}
	
	public static ItauUtil getInstance() {
		return instance;
	}
	
	public String formatarData(Date data) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		return df.format(data);
	}

	public Conta[] getContas() {
		return contas;
	}

	public void setContas(Conta[] contas) {
		this.contas = contas;
	}
	
	public Boolean adicionarConta(Conta conta) {
		Boolean rolou = Boolean.FALSE;
		if (indice < 5) {
			contas[indice++] = conta;
			rolou = Boolean.TRUE;
		}
		return rolou;
	}
	
	public Conta recuperarConta(Integer numeroConta) throws ItauException {
		Conta contaEncontrada = null;
		for (Conta conta : contas) {
			if (conta != null && conta.getNumeroConta().equals(numeroConta)) {
				contaEncontrada = conta;
				break;
			}
		}
		if (contaEncontrada == null) {
			throw new ItauException("Conta não encontrada");
		}
		return contaEncontrada;
		
	}

	public void tarifarContas() {
		for (Conta conta : contas) {
			if (conta instanceof ITarifavel) {
				ITarifavel contaTarifavel = (ITarifavel) conta;
				tarifar(contaTarifavel);
			}			
		}
	}
	
	private void tarifar(ITarifavel contaTarifavel) {
		contaTarifavel.cobrarTarifa();
	}

	public void captalizarContas() {
		for (Conta conta : contas) {
			if (conta instanceof ICaptalizavel) {
				ICaptalizavel contaCaptalizavel = (ICaptalizavel) conta;
				captalizar(contaCaptalizavel);	
			}
		}
	}
	
	private void captalizar(ICaptalizavel contaCaptalizavel) {
		contaCaptalizavel.captalizar();
	}

	public Conta[] recuperarContas() {
		Integer quantidadeContas = 0;
		Conta[] contasTemp = null;
		for (Conta conta : this.contas) {
			if (conta != null) {
				quantidadeContas++;
			}
		}
		contasTemp = new Conta[quantidadeContas];
		for (int i = 0; i < this.contas.length; i++) {
			if (this.contas[i] != null) {
				contasTemp[i] = contas[i];
			}
		}
		return contasTemp;
	}

	public void deletarConta(Conta conta) {
		for (int i = 0; i < contas.length; i++) {
			if (contas[i].equals(conta)) {
				contas[i] = null;
				break;
			}
		}
	}
	
	public String recuperarPrimeiraLetra(String texto) {
		return texto.substring(0, 1);
	}
	
	public void notificarGerencia(INotificavel notificavel) {
		System.out.println(notificavel.getEmail() + " " + notificavel.getMensagem());
	}
	
	
}
