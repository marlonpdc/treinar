package gabriel.colecao;

import java.util.ArrayList;
import java.util.List;

public class TestePessoa {

	public static void main(String[] args) {
		List<Pessoa> c = new ArrayList<>();
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
		
		p1.nome = "Gabriel";
		p2.nome = "Gilberto";
		p3.nome = "Bruno";
		
		p1.idade =  13;
		p2.idade =  19;
		p3.idade =  26;
		
		p1.peso =   50D;
		p2.peso =   65D;
		p3.peso =   70D;
		
		
		
		c.add(p1);
		c.add(p2);
		c.add(p3);
		
		
		for (Pessoa pessoa : c) {
			
			System.out.println(pessoa);
		}
	}
}
