package br.com.treinar.tarefa.brunner;

import br.com.treinar.escola.modelo.Aluno;
import br.com.treinar.escola.modelo.Pao;

public class TestePao {
	
	public static void main(String[] args) {
	
		Aluno aluno = new Aluno();
		
		Pao pao = aluno.comprarPao(10.5);
		System.out.println(pao.pesoEmGramas);
	
	}

}
