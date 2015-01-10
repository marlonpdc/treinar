package br.com.treinar.tarefa.Caio;
import java.util.Date;

import br.com.treinar.escola.modelo.Pessoa;

public class TesteConstrutor {

	public TesteConstrutor() {
		
	}
	
	public static void main(String[] args) {
		Date dataNascimento = new Date();
		String nome = "Buda";
		Pessoa pessoa = new Pessoa(nome, dataNascimento);
		
		System.out.println(pessoa.nome);
		
		
	}
}
