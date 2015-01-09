package br.com.treinar.tarefa.Leandro;

import br.com.treinar.escola.modelo.Aluno;
import br.com.treinar.escola.modelo.Pao;

public class TesteParametro {

	public static void main(String[] args) {
		
		Pao pao = null;
		
		Aluno xAluno = new Aluno();		
		pao = xAluno.comprarPao(1.90);
				
		System.out.println("O peso do pão é: " + pao.pesoEmGramas);
		
	}
}
