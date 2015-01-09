package br.com.treinar.escola.visao;

import br.com.treinar.escola.modelo.Aluno;
import br.com.treinar.escola.modelo.Pao;
import br.com.treinar.escola.modelo.Prova;

public class Escola {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.nome = "Amanda";

		Aluno aluno2;

		aluno2 = new Aluno();
		aluno2.nome = "Nathalia";

		Aluno aluno3 = aluno;

		System.out.print("Antes de mudar: ");
		System.out.println(aluno.nome);

		aluno3.nome = "Amanda Cravo Moura";

		System.out.print("Depois de mudar: ");
		System.out.println(aluno.nome);

		Prova prova = aluno.fazerProva();
		System.gc();
		System.out.println(prova.questao);
		System.out.println(prova.resposta);

		System.out.println("fim...");
		
		Pao pao = new Pao();
		System.out.println();
	}

}
