package gabriel.colecao;

import java.util.ArrayList;
import java.util.List;

import sun.security.jca.GetInstance;

public class TestePessoa {

	public static void main(String[] args) {
		List<Pessoa> c = new ArrayList<>();
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
		
		p1.setNome("Gabriel");
		p2.setNome("Gilberto");
		p3.setNome("Bruno");
		
		p1.setIdade(13);
		p2.setIdade(26);
		p3.setIdade(19);
		
		p1.setPeso(50D);
		p1.setPeso(65D);
		p1.setPeso(70D);
		
		
		
		c.add(p1);
		c.add(p2);
		c.add(p3);
		
		
		for (Pessoa pessoa : c) {
			
			System.out.println(pessoa);
		}
	}
}
