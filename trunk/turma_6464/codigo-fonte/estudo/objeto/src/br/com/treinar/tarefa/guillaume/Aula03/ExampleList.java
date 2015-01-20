package br.com.treinar.tarefa.guillaume.Aula03;

import java.util.ArrayList;
import java.util.List;

public class ExampleList {
	public static void main(String[] args) {
		Automovel a1 = new Automovel("Renault", "Sandero");
		Automovel a2 = new Automovel("Renault", "Logan");
		Automovel a3 = new Automovel("Renault", "Duster");
		Automovel a4 = new Automovel("Fiat", "Uno");
		Automovel a5 = new Automovel("Fiat", "Palio");
		Automovel a6 = new Automovel("Fiat", "Punto");
		
		List <Automovel> ListaAutomovel = new ArrayList<Automovel>();
		ListaAutomovel.add(a1);
		ListaAutomovel.add(a1);
		ListaAutomovel.add(a2);
		ListaAutomovel.add(a3);
		ListaAutomovel.add(a4);
		ListaAutomovel.add(a5);
		ListaAutomovel.add(a6);
		
		for(Automovel myCar : ListaAutomovel)
		{
			System.out.println(myCar.getMarca()+" "+myCar.getModelo());
		}
	}
}
