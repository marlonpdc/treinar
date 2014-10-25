package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaAutomovel {
	public static void main(String[] args) {
		Automovel a = new Automovel();
		a.setChassi(234556);
		a.setTipo("Palio");
		Automovel a2 = new Automovel(); 
		a2.setChassi(466);
		a2.setTipo("Siena");
		Automovel a3 = new Automovel();
		a3.setTipo("ka");
		a3.setChassi(776654);
		List<Automovel> lista = new ArrayList<>();
		lista.add(a);
		lista.add(a2);
		lista.add(a3);
		
		Collections.sort(lista);
		
		for (Automovel automovel : lista) {
			
			System.out.println(automovel);
		}
		
		
		
		
	}
}
