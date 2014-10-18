package br.com.treinar.bb.controle;

import br.com.treinar.bb.banco.Conta;
import br.com.treinar.bb.dado.BaseDados;

public class DadosContaControle {
	
	public String recuperarDados(){
		String dados = "";
		Conta[] contas = BaseDados.getInstance().recuperarContas();
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null) {
				dados += contas[i].toString();
				dados += "\n\n";				
			}
		}
		
		return dados;
	}
		
		
}
