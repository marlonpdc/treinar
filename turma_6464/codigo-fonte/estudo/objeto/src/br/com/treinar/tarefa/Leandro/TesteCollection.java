package br.com.treinar.tarefa.Leandro;

import java.util.ArrayList;
import java.util.Collection;

public class TesteCollection {
	
	public static <E> void main(String[] args) {
		
		Collection<Automovel> lista = new ArrayList<Automovel>();
		
		Automovel xAutomovel1 = new Automovel();
		Automovel xAutomovel2 = new Automovel();
		Automovel xAutomovel3 = new Automovel();
		Automovel xAutomovel4 = new Automovel();
		
		xAutomovel1.setModelo("Gol");
		xAutomovel1.setChassi(11111);		
		lista.add(xAutomovel1);
		
		xAutomovel2.setModelo("Vectra");
		xAutomovel2.setChassi(22222);
		lista.add(xAutomovel2);
		
		xAutomovel3.setModelo("Fox");
		xAutomovel3.setChassi(33333);
		lista.add(xAutomovel3);
		
		xAutomovel4.setModelo("Punto");
		xAutomovel4.setChassi(44444);
		lista.add(xAutomovel4);
		
		for (Automovel veiculo : lista) {
			System.out.println("\n\t");
			System.out.println("\tModelo: " + veiculo.getModelo() + "\n\tChassi: " + veiculo.getChassi());
		}
		
	}

}
