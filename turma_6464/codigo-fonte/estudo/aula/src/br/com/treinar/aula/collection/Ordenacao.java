package br.com.treinar.aula.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.treinar.aula.dois.Pessoa;

public class Ordenacao {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<String>();
		nomes.add("brunner");
		nomes.add("caio");
		nomes.add("charles");
		nomes.add("fernando");
		nomes.add("gabriel");
		nomes.add("gleidson");
		nomes.add("guillaume");
		nomes.add("itanilson");
		nomes.add("leandro");
		nomes.add("marlon");
		nomes.add("matheus");
		nomes.add("wagner");
		
		Collections.sort(nomes);
		System.out.println(nomes);
		
		List<Pessoa> alunos = new ArrayList<Pessoa>();

		Pessoa aluno1 = new Pessoa();
		aluno1.setNome("Amanda");
		aluno1.setCpf(55546265302L);
		
		Pessoa aluno2 = new Pessoa();
		aluno2.setNome("Itanilson");
		aluno2.setCpf(55546265303L);

		Pessoa aluno3 = new Pessoa();
		aluno3.setNome("Gabriel");
		aluno3.setCpf(55546265301L);
		
		alunos.add(aluno2);
		alunos.add(aluno3);
		alunos.add(aluno1);

		Collections.sort(alunos);
		System.out.println("Ordenados pelo nome, padrão do objeto");
		System.out.println(alunos);
		CriterioOrdenacaoPessoa ctps = new CriterioOrdenacaoPessoa();
		System.out.println("\n\nOrdenados por CPF");
		Collections.sort(alunos, ctps);
		System.out.println(alunos);
		
		
		Collections.sort(alunos, new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				return o1.getCpf().compareTo(o2.getCpf()) * -1;
			}
		});
		
		System.out.println(alunos);
		
		Collections.sort(nomes, criterioOrdenacaoNomeInvertido());
		
		System.out.println("Ordenando por nome invertido");
		System.out.println(nomes);
	}

	private static Comparator<String> criterioOrdenacaoNomeInvertido() {
		return new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2) * -1;
			}
		};
	}
	
}
