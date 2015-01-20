package br.com.treinar.tarefa.emerson;

import java.util.HashSet;
import java.util.Set;

public class TreinandoHastSet {
	public static void main(String[] args) {
		Set<String> cargos = new HashSet<String>();

		cargos.add("Encarregado");
		cargos.add("Desenhista");
		cargos.add("InspetorSolda");
		cargos.add("caldeireiro");
		cargos.add("Soldador");
		cargos.add("Maçariqueiro");
		cargos.add("Encarregado");



		System.out.println(cargos);
		System.out.println(cargos.size());

		Boolean removido = cargos.remove("Encarregado");

		System.out.println(removido ? "Removido" : "Não Removido");

		for (String nome : cargos) {

			System.out.println(nome + " " + nome.length() + " Letras");
		}


	}

}
