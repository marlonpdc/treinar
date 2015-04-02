package estudo.collecton;

import java.util.ArrayList;
import java.util.Collection;

import estudo.objeto.Pessoa;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class EstudoColletionList {

	public static void main(String[] args) {
		Collection c = new ArrayList<>();
		Pessoa p = new Pessoa();
		Pessoa p2 = new Pessoa();
		String amanha = "Ontem";
		
		c.add(p);
		c.add(p2);
		c.add(amanha);
		Pessoa pessoa = null;
		for (Object object : c) {
			if (object instanceof Pessoa) {
				pessoa = (Pessoa)object;
				System.out.println(pessoa.getNome());
				System.out.println(pessoa.getAltura());
			}
		}
	}

	
}
