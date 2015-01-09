package br.com.treinar.tarefa.fernando;

import br.com.treinar.escola.modelo.Aluno;
import br.com.treinar.escola.modelo.Pao;

public class Fernando {
	
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Pao pao = aluno.comprarPao(1200.00);
		System.out.println(pao.pesoEmGramas);
		
	}
	
}
