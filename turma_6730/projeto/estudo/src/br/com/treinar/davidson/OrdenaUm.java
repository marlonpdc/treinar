package br.com.treinar.davidson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.treinar.estudo.modelo.Atleta;

public class OrdenaUm {
	public static void main(String[] args) {

		Atleta a2 = new Atleta("Kajsa Ribeiro Gadelha", 30, 30);
		Atleta a1 = new Atleta("Davidson Marcos Batista", 31, 31);

		List<Atleta> atletas = new ArrayList<Atleta>();

		atletas.add(a1);
		atletas.add(a2);

		Collections.sort(atletas);

		System.out.println(atletas);

	}
}
