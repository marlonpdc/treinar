package br.com.treinar.bb.controle;

import br.com.treinar.bb.banco.Conta;
import br.com.treinar.bb.dado.BaseDados;

public class DadosContaControle {
	
	public String recuperarDados(){
		String dados = "";
		Conta[] contas = BaseDados.getInstance().recuperarContas();
		for (int i = 0; i < contas.length; i++) {
			dados = "Nome do Cliente";
			dados += contas[i].cliente.nome;
			dados += "\n Data Nascimento do Cliente";
			dados += contas[i].cliente.dataNascimento;
			dados += "\n\n";
		}
		
		return dados;
	}
		
		
}
