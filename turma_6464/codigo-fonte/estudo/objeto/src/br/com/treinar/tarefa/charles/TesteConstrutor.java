package br.com.treinar.tarefa.charles;

import java.util.Date;

import br.com.treinar.escola.modelo.Pessoa;

public class TesteConstrutor {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Charles", new Date());
				
		System.out.println("Nome: " + pessoa.nome);
		System.out.println("Data: " + pessoa.dataNascimento);

		
	}

}
