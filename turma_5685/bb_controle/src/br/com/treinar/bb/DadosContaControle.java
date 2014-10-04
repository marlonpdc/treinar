package br.com.treinar.bb;

import br.com.treinar.bb.dado.BaseDados;

public class DadosContaControle {
	
	public String recuperarDados(){
	
		String dados = BaseDados.getInstance().conta.cliente.nome;
		dados +="/n"; 
		dados += BaseDados.getInstance().conta.cliente.dataNascimento;
		dados += "/n";
		return dados;
	}
		
		
}
