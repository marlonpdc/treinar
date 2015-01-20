package br.com.treinar.aula.collection;

import java.util.HashSet;
import java.util.Set;

import br.com.treinar.aula.dois.Pessoa;

public class ExemploCollectionSet {

	public static void main(String[] args) {
		Set<Pessoa> alunos = new HashSet<Pessoa>();

		Pessoa aluno1 = new Pessoa();
		aluno1.setNome("Pedro");
		aluno1.setCpf(55546265302L);
		
		Pessoa aluno2 = new Pessoa();
		aluno2.setNome("Paulo");
		aluno2.setCpf(55546265302L);
		
		Pessoa aluno3 = aluno2;
		
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		
		System.out.println(alunos.size());
		
	}
	
}
