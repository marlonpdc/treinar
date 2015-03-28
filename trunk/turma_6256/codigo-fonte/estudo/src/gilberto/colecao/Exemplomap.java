package gilberto.colecao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Exemplomap {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Entre com a quantidade de Pessoas:");
		Integer np = s.nextInt();
			
		Map<Character, List<String>> map = new HashMap<Character, List<String>>();

		for (int i = 0; i < np; i++) {

			System.out.println("Entre com no Nome da " + i + "°pessoa: ");
			String nome = s.next();
			Character letra = nome.charAt(0);
			if(!map.containsKey(letra)) {
				map.put(letra, new ArrayList<String>());
			}
			map.get(letra).add(nome);
		}
		
		System.out.println(map.toString());
	}
}