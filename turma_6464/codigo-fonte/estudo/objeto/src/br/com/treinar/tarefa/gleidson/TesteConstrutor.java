package br.com.treinar.tarefa.gleidson;

import java.util.Date;

import br.com.treinar.escola.modelo.Pessoa;

public class TesteConstrutor {

	public static void main(String[] args) {
		
		
		String nome = "Gleidson";
		Date dataNascimento = new Date();
		
		Pessoa pessoa = new Pessoa(nome, dataNascimento);
		
		
		System.out.println(pessoa.nome + " - " + pessoa.dataNascimento);
	}
	
}
