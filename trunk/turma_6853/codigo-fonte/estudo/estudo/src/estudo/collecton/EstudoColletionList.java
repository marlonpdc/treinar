package estudo.collecton;

import java.util.ArrayList;
import java.util.List;

import estudo.objeto.Pessoa;

public class EstudoColletionList {

	public static void main(String[] args) {
		List<Pessoa> c = new ArrayList<>();
		Pessoa p = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = p2;
		//String amanha = "Ontem";
		
		c.add(p);
		c.add(p2);
		//c.add(amanha);
		c.add(p3);
		System.out.println(c.size());
		for (Object object : c) {
			if (object instanceof Pessoa) {
				System.out.println(((Pessoa)object).getNome());
				System.out.println(((Pessoa)object).getAltura());
			}
		}
	}

	
}
