package br.com.treinar.tarefa.matheus;

import br.com.treinar.escola.modelo.Aluno;
import br.com.treinar.escola.modelo.Pao;

public class TesteParametro {
	
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		double dinheiro = 1;
		try {
			Pao pao = aluno.comprarPao(dinheiro);
			System.out.println(pao.pesoEmGramas);
		} catch (Exception e) {
			System.out.println("Dinheiro insuficiente");
		}
		
		
	}

}
