package br.com.treinar.estudo.string;

import br.com.treinar.estudo.modelo.Atleta;

public class TesteString {

	public static void main(String[] args) {
		
		String a = "a";
		String b = "a";
		String c = new String("c");
		System.out.println(c + a + b);
		Atleta atleta = new Atleta();
		System.out.println(atleta);
		//nao quero mais atleta
		atleta = null;
		System.gc();
		
		String nome = "Sophia";
		String nomeDoMeio = "Guimarães";
		String sobrenome = "Moura";
		
		String fullName = nome + " " + nomeDoMeio + " " + sobrenome;
		System.out.println(fullName);
		
		StringBuilder sbFullName = new StringBuilder();
		sbFullName.append(nome).append(" ").append(nomeDoMeio).append(" ").append(sobrenome);
		System.out.println(sbFullName);
		
		
		sbFullName.append(";" + " Filha");
		
		System.out.println(sbFullName);
		
		String t = "teste ";
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			t += t;
		}
		System.out.println(t);
		StringBuilder m = new StringBuilder("teste ");
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			m.append(m);
		}
		System.out.println(m);
		
	}
	
}
