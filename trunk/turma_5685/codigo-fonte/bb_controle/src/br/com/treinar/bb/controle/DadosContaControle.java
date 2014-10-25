package br.com.treinar.bb.controle;

import java.util.List;

import br.com.treinar.bb.banco.Conta;
import br.com.treinar.bb.dado.BaseDados;

public class DadosContaControle {
	
	public String recuperarDados(){
		String dados = "";
		List<Conta> contas = BaseDados.getInstance().recuperarContasAtivas();
		for (Conta c : contas) {
			if (c != null) {
				dados += c.toString();
				dados += "\n\n";				
			}
		}
		
		return dados;
	}
		
		
}
