package br.com.treinar.tarefa.Caio;

import br.com.treinar.escola.modelo.Aluno;
import br.com.treinar.escola.modelo.Pao;

public class TesteParametro {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Pao pao = aluno.comprarPao(2.5);
		
		
		System.out.println(pao.pesoEmGramas);	
	}
	
	
}
