package estudo.collecton;

import java.util.HashSet;
import java.util.Set;

import estudo.objeto.Pessoa;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class EstudoColletionSet {

	public static void main(String[] args) {
		Set c = new HashSet();
		Pessoa p = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = p2;
		String amanha = "Ontem";
		
		c.add(p);
		c.add(p2);
		c.add(p3);
		c.add(amanha);
		
		System.out.println(c.contains(p3));
		
		System.out.println(c.size());
		Pessoa pessoa = null;
		for (Object object : c) {
			if (object instanceof Pessoa) {
				pessoa = (Pessoa)object;
				System.out.println(pessoa);
			}
		}
		
	}
	
}
