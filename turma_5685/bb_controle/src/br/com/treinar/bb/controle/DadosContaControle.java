package br.com.treinar.bb.controle;

import br.com.treinar.bb.banco.Conta;
import br.com.treinar.bb.dado.BaseDados;

public class DadosContaControle {
	
	public String recuperarDados(){
		String dados = "";
		Conta[] contas = BaseDados.getInstance().recuperarContas();
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null) {
				dados += "Nome do Cliente ";
				dados += contas[i].getCliente().getNome();
				dados += " Data Nascimento: ";
				dados += contas[i].getCliente().getDataNascimento();				
				dados += " Saldo: " + contas[i].recuperarSaldo();
				dados += " Status Conta: " + contas[i].getStatusConta();
				dados += "\n\n";				
			}
		}
		
		return dados;
	}
		
		
}
