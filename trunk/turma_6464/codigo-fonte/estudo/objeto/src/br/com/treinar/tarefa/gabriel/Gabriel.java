package br.com.treinar.tarefa.gabriel;

import br.com.treinar.escola.modelo.Aluno;
import br.com.treinar.escola.modelo.Pao;


public class Gabriel {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Pao pao = aluno.comprarPao(2.);
		System.out.println(pao.pesoEmGramas);
	}
}
