package br.com.treinar.tarefa.guillaume.Aula03;

import java.util.HashSet;
import java.util.Set;

public class ExampleSet {
	public static void main(String[] args) {
		Automovel a1 = new Automovel("Renault", "Sandero");
		Automovel a2 = new Automovel("Renault", "Logan");
		Automovel a3 = new Automovel("Renault", "Duster");
		Automovel a4 = new Automovel("Fiat", "Uno");
		Automovel a5 = new Automovel("Fiat", "Palio");
		Automovel a6 = new Automovel("Fiat", "Punto");
		
		Set <Automovel> SetAutomovel = new HashSet<Automovel>();
		SetAutomovel.add(a1);
		SetAutomovel.add(a1);
		SetAutomovel.add(a2);
		SetAutomovel.add(a2);
		SetAutomovel.add(a3);
		SetAutomovel.add(a4);
		SetAutomovel.add(a4);
		SetAutomovel.add(a5);
		SetAutomovel.add(a6);
		
		for(Automovel myCar : SetAutomovel)
		{
			System.out.println(myCar.getMarca()+" "+myCar.getModelo());
		}
		System.out.println(SetAutomovel.size());
	}
}
