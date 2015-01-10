package br.com.treinar.tarefa.gabriel;

import java.util.Date;

import br.com.treinar.escola.modelo.Pessoa;

public class TesteConstrutor {
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Gabriel",new Date());
		
		System.out.println("Nome pessoa : " + pessoa.nome);
		System.out.println("Data nascimento : " + pessoa.dataNascimento);
	}
}
