package br.com.treinar.itau.modelo.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.treinar.itau.modelo.banco.Conta;
import br.com.treinar.itau.modelo.banco.ICaptalizavel;
import br.com.treinar.itau.modelo.banco.ITarifavel;


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
	
	public Conta recuperarConta(Integer numeroConta) {
		Conta contaEncontrada = null;
		for (Conta conta : contas) {
			if (conta.getNumeroConta().equals(numeroConta)) {
				contaEncontrada = conta;
				break;
			}
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
		contaTarifavel.calcularTarifa();
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
}
