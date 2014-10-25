import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Desafio {


	public static void main(String[] args) {
		//Comparador comp  = new Comparador();
		Map<String,List<String>> nomes = new HashMap<String ,List<String>>();
		List<String> lista = new ArrayList<>();
		lista.add("Albert");
		lista.add("Raquel");
		lista.add("Alano");
		lista.add("Robson");
		lista.add("Fernando");
		lista.add("Gabriel");
		lista.add("Gilberto");

		String primeiraLetra = null;
		for (String nome : lista) {
			primeiraLetra = nome.substring(0, 1);
			if (!nomes.containsKey(primeiraLetra)) {
				nomes.put(primeiraLetra, new ArrayList<String>());
			}
			nomes.get(primeiraLetra).add(nome);
		}
		System.out.println(nomes);

		//Collections.sort(nomes, comp);
	}
}
