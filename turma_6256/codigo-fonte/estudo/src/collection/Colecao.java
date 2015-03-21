package collection;

import java.util.ArrayList;
import java.util.List;

import estudo.dominiodiscreto.Turno;

public class Colecao {

	public static void main(String[] args) {
		List<Turno> c = new ArrayList<>();
		
//		c.add("a");
//		c.add("a");
//		c.add("b");
//		c.add(10);
		c.add(Turno.MANHA);
		c.add(Turno.TARDE);
		c.add(Turno.NOITE);
		c.add(Turno.MANHA);
		
		for (Turno turno : c) {
			System.out.println(turno.getDescricao());
		}

		
	}
	
}
