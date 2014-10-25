package fernandoCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista {
	public static void main(String[] args) {
		List<Celular> lista = new ArrayList<>();
		Celular c1 = new Celular();
		c1.setMarca("Samsung");
		c1.setTela(5);
		Celular c2 = new Celular();
		c2.setMarca("Motorola");
		c2.setTela(4);
		Celular c3 = new Celular();
		c3.setMarca("LG");
		c3.setTela(3);		
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		Collections.sort(lista);
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		
		
	}
	
}
