package colecoes;

import java.util.ArrayList;
import java.util.List;

public class TestaAutomovel {
	public static void main(String[] args) {
		Automovel a = new Automovel();
		a.setChassi(234556);
		a.setTipo("Palio");
		
		List<Automovel> lista = new ArrayList<>();
		lista.add(a);
		
		System.out.println(lista);
		
		
	}
}
