package gilberto.colecao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrincipalMap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// map
		// declaração
		Map<Integer, Pessoa> map = new HashMap<Integer, Pessoa>();

		Pessoa p3 = new Pessoa();
		p3.setPeso(80);
		p3.setNome("gilberto");


		Pessoa p4 = new Pessoa();
		p4.setPeso(90);
		p4.setNome("ana");
		
		// adicionando no map
		map.put(p3.getPeso(), p3);
		map.put(p4.getPeso(), p4);

		// pegando o registro a partir do codigo
		Pessoa p = map.get(s.nextInt());
		System.out.println("Pesso:" + p.toString());
		// ;;;;
	}

}
