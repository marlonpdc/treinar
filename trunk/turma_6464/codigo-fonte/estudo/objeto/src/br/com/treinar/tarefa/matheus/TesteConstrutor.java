package br.com.treinar.tarefa.matheus;

import java.util.Date;

import br.com.treinar.escola.modelo.Pessoa;

public class TesteConstrutor {
	
	public static void main(String[] args) {
		String pessoa = "Matheus";
		Date data = new Date();
		
		Pessoa p = new Pessoa(pessoa, data);
		System.out.println(p.nome);
		System.out.println(p.dataNascimento);
		
	}

}
