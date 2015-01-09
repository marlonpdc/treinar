package br.com.treinar.tarefa.charles;

import br.com.treinar.escola.modelo.Aluno;
import br.com.treinar.escola.modelo.Pao;

public class TesteParametro {
	
	public static void main(String[] args) {
		
		Pao pao = null;
		
		Aluno aluno = new Aluno();
		
		pao = aluno.comprarPao(1.5);
		
		System.out.println("O valor para comprar o pão é: " + pao.pesoEmGramas);
		
	}

}
