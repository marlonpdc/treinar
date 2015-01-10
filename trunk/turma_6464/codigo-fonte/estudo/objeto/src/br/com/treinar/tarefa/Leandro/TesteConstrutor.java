package br.com.treinar.tarefa.Leandro;

import java.util.Date;
import br.com.treinar.escola.modelo.Pessoa;

public class TesteConstrutor {
	
	public static void main(String[] args) {
		
		Pessoa xPessoa = new Pessoa(null, null);
		
		xPessoa.nome = "Leandro";
		xPessoa.dataNascimento = new Date();
		
		System.out.println("Nome: " + xPessoa.nome);
		System.out.println("Data Nascimento: " +xPessoa.dataNascimento);
		
	}
}
