package br.com.treinar.bb.controle;

import br.com.treinar.bb.dado.BaseDados;

public class DadosContaControle {
	
	public String recuperarDados(){
	
		String dados = "Nome do Cliente";
		dados += BaseDados.getInstance().conta.cliente.nome;
		dados += "\n Data Nascimento do Cliente";
		dados += BaseDados.getInstance().conta.cliente.dataNascimento;
		dados += "\n";
		return dados;
	}
		
		
}
