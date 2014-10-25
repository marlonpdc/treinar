package fernandoCollection;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String[] args) {
		List<Celular> lista = new ArrayList<>();
		Celular c = new Celular();
		c.setMarca("Samsung");
		c.setModelo("s4");
		lista.add(c);
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
}
