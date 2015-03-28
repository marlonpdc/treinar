package gilberto.colecao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Entre com a quantidade de Pessoas:");
		Integer qtd = s.nextInt();
		
		List<Pessoa> lista = new ArrayList<Pessoa>();
		
		for (int i = 1; i < qtd+1; i++) {

			Pessoa p = new Pessoa();

			System.out.println("Entre com o Nome da " + i + "°: ");
			String nome = s.next();
			System.out.println("Entre com o Peso da " + i + "°: ");
			Integer peso = s.nextInt();
			
			p.setNome(nome);
			p.setPeso(peso);
			lista.add(p);
			s.nextLine();
		}
		s.close();
		System.out.println(lista.toString());

	}

}
