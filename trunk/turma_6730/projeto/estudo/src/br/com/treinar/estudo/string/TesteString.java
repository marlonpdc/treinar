package br.com.treinar.estudo.string;

import br.com.treinar.estudo.modelo.Atleta;

public class TesteString {

	public static void main(String[] args) {
		
		String a = "a";
		String b = "a";
		String c = new String("c");
		
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
		
		
		
	}
	
}
