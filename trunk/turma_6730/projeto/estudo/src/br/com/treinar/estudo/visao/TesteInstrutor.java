package br.com.treinar.estudo.visao;

import br.com.treinar.estudo.modelo.Instrtutor;

public class TesteInstrutor {

	public static void main(String[] args) {
		Instrtutor instrtutor0;
		System.out.println("codigo...");
		instrtutor0 = new Instrtutor();
		instrtutor0.nome = "Gleidson";
		instrtutor0.peso = 77;
		instrtutor0.categora = "leve";
		
		
		
		System.out.println(instrtutor0.nome);
		System.out.println(instrtutor0.peso);
		System.out.println(instrtutor0.categora);
		
		
		
	}
	
}
