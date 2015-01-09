package br.com.treinar.tarefa.wagner;

import br.com.treinar.escola.modelo.Aluno;
import br.com.treinar.escola.modelo.Pao;

public class Wagner {

	public static void main(String[] args) 
	{
		Aluno aluno = new Aluno();
		Pao pao = aluno.comprarPao(6.1);
		System.out.print(pao.pesoEmGramas);
		
	}

}
